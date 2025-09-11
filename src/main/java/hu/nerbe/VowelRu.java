package hu.nerbe;

import java.util.Set;

public class VowelRu implements VowelCheckable {
  public static final Set<Character> VOWELS = Set.of('а', 'е', 'ё', 'и','й','о','у', 'ы', 'э', 'ю', 'я');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }
}
