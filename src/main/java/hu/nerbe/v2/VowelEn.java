package hu.nerbe.v2;

import java.util.Set;

public class VowelEn implements VowelCheckable {
  public static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');

  @Override
  public boolean isVowel(char ch) {
    return vowels.contains(ch);
  }

}
