package hu.nerbe;

import java.util.Set;

public class VowelEn implements VowelCheckable {
  public static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'y');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }

}
