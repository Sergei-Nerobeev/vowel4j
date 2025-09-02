package hu.nerbe.v2;

import java.util.Set;

public class VowelHu implements VowelCheckable {
  public static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');

  @Override
  public boolean isVowel(char ch) {
    return vowels.contains(ch);
  }
}
