package dev.magallon.challenge_04;

import java.util.ArrayList;

public class ChecksumValidator {
  private String fileName;
  private String checksum;
  private ArrayList<Character> uniqueCharacters = new ArrayList<>();
  private ArrayList<Character> repeatedCharacters = new ArrayList<>();

  public ChecksumValidator(String fileName, String checksum) {
    this.fileName = fileName;
    this.checksum = checksum;
  }

  public boolean validate() {
    String calculatedChecksum = calculateChecksum();

    return this.checksum.equalsIgnoreCase(calculatedChecksum);
  }

  private String calculateChecksum() {
    char[] fileNameSplitted = this.fileName.toCharArray();

    for (char character : fileNameSplitted) {
      if (uniqueCharacters.contains(character)) {
        int index = uniqueCharacters.indexOf(character);
        uniqueCharacters.remove(index);
        repeatedCharacters.add(character);
      }

      if (!repeatedCharacters.contains(character)) {
        uniqueCharacters.add(character);
      }
    }

    return Utils.arrayListToString(this.uniqueCharacters);
  }
}
