package hu.nerbe.v2;

import java.util.Set;

public class VowelRu implements VowelCheckable {
  public static Set<Character> vowels = Set.of('а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я');

  @Override
  public boolean isVowel(char ch) {
    return vowels.contains(ch);
  }
}
