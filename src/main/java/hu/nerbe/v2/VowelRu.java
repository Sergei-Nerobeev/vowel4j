package hu.nerbe.v2;

import java.util.Set;

public class VowelRu implements VowelCheckable {
  public static final Set<Character> VOWELS = Set.of('а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я');

  @Override
  public boolean isVowel(char ch) {
    //
    return VOWELS.contains(ch);
  }
}
