package hu.nerbe.v2;

import java.util.Set;

public class VowelHu implements Vowel {
  @Override
  public boolean isVowel(char ch) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');
    return vowels.contains(ch);
  }
}
