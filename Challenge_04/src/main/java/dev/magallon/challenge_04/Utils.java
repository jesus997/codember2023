package dev.magallon.challenge_04;

import java.util.ArrayList;

public class Utils {
  public static String arrayListToString(ArrayList<Character> arrayList) {
    String output = "";
    for (char c : arrayList) {
      output = output + c;
    }
    return output;
  }
}
