package dev.magallon.challenge_04;

import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChecksumValidatorTest {
  @Test
  void testFileXyzz33ShouldBeReal() {
    ChecksumValidator validator = new ChecksumValidator("xyzz33", "xy");
    Assertions.assertTrue(validator.validate());
  }

  @Test
  void testAbcca1ShouldBeFalse() {
    ChecksumValidator validator = new ChecksumValidator("Abcca1", "ab1");
    Assertions.assertFalse(validator.validate());
  }

  @Test
  void testAbbc11ShouldBeFalse() {
    ChecksumValidator validator = new ChecksumValidator("Abbc11", "ca");
    Assertions.assertFalse(validator.validate());
  }
}
