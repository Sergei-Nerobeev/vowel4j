package hu.nerbe.v2;

import java.util.Set;

public class VowelRu implements VowelCheckable {
  public static Set<Character> vowels;

  @Override
  public boolean isVowel(char ch) {
    vowels = Set.of('а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я');
    return vowels.contains(ch);
  }
}
