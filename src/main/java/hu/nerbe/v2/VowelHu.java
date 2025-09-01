package hu.nerbe.v2;

import java.util.Set;

public class VowelHu implements VowelCheckable {
  public static Set<Character> vowels;

  @Override
  public boolean isVowel(char ch) {
    vowels = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');
    return vowels.contains(ch);
  }
}
