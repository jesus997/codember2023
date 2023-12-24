class EncryptionPoliciesValidator
  attr_accessor :invalid_policies

  def initialize(policies)
    @policies = policies
  end

  def validate
    @invalid_policies = @policies.find_all do |policy|
      !validate_policy(policy)
    end

    @invalid_policies
  end

  private

  def validate_policy(policy)
    # 2-4 f: fgff
    rule, key = parse_policy(policy)
    range, letter = rule

    return false if range.nil?

    letters = key.to_s.split('').group_by { |l| l }

    return false if letters[letter].nil?

    letters[letter].count >= range[0] && letters[letter].count <= range[1]
  end

  def parse_policy(policy)
    rule, key = policy.split(':')
    key.to_s.strip!
    rule = parse_rule(rule)

    [rule, key]
  end

  def parse_rule(rule)
    return [nil, nil] if rule.nil? || rule == ''

    range, letter = rule.split(' ')
    min, max = range.split('-').map { | n | n.to_i }

    [[min, max], letter]
  end
end
