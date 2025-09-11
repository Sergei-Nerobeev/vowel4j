package hu.nerbe;

import java.util.Set;

public class VowelHu implements VowelCheckable {
  public static final Set<Character>
      VOWELS = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }
}
