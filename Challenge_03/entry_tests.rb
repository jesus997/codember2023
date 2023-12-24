require 'test/unit'
require './EncryptionPoliciesValidator'

class EntryTest < Test::Unit::TestCase
  def testSecondPolicyShouldBeInvalid
    policies = [
      "2-4 f: fgff",
      "4-6 z: zzzsg",
      "1-6 h: hhhhhh"
    ]

    policy_validator = EncryptionPoliciesValidator.new(policies)

    invalid_policies = policy_validator.validate

    assert invalid_policies[0] == policies[1]
  end

  def testNoOneShouldBeInvalid
    policies = [
      "2-4 f: fgff",
      "4-6 z: zzzzg",
      "1-6 h: hhhhhh"
    ]

    policy_validator = EncryptionPoliciesValidator.new(policies)

    invalid_policies = policy_validator.validate

    assert invalid_policies.empty?
  end
end
