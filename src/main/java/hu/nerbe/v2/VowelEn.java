package hu.nerbe.v2;

import java.util.Set;

public class VowelEn implements Vowel {
  @Override
  public boolean isVowel(char ch) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
    return vowels.contains(ch);
  }

}
