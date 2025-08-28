package hu.nerbe.v2;

import java.util.Set;

public class VowelEn implements VowelCheckable {
  public static Set<Character> vowels;

  @Override
  public boolean isVowel(char ch) {
    vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
    return vowels.contains(ch);
  }

}
