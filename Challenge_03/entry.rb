require './EncryptionPoliciesValidator'

# Open file with all policies
policies_file = File.open('../data/encryption_policies.txt')
policies = policies_file.readlines.map(&:chomp)

# Validate policies
policy_validator = EncryptionPoliciesValidator.new(policies)
invalid_policies = policy_validator.validate

# Print bad policy at 42 position
puts invalid_policies[41]
