package hu.nerbe;

import java.util.Set;

public class Vowel4j {



  public static boolean isVowelEn(char ch) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
    return vowels.contains(ch);
  }

  public static boolean isVowelHu(char ch) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');
    return vowels.contains(ch);
  }


}
