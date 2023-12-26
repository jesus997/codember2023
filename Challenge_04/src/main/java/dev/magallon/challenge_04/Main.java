package dev.magallon.challenge_04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> files = getFiles();
    ArrayList<String> validFiles = new ArrayList<>();

    for (String f : files) {
      String[] token = f.split("-");
      ChecksumValidator validator = new ChecksumValidator(token[0], token[1]);

      if (validator.validate()) {
        validFiles.add(f);
      }
    }

    System.out.println(validFiles.get(32)); // 33
  }

  public static ArrayList<String> getFiles() {
    ArrayList<String> files = new ArrayList<>();
    URL url = Main.class.getResource("/files_quarantine.txt");
    File resourceFile = new File(url.getPath());

    try {
      FileReader fileReader = new FileReader(resourceFile);
      BufferedReader reader = new BufferedReader(fileReader);

      try {
        String line = reader.readLine();
        while (null != line) {
          files.add(line);
          line = reader.readLine();
        }
      } finally {
        reader.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return files;
  }
}
