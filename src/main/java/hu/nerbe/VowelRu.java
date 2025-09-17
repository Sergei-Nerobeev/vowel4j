package hu.nerbe;

import java.util.Set;

/**
 * @author Sergei Nerobeev
 * @version 1.0.1
 * @see VowelCheckable
 * @since 2025-09-15
 */

public class VowelRu implements VowelCheckable {
  public static final Set<Character> VOWELS =
      Set.of('а', 'А', 'е', 'Е', 'ё', 'Ё', 'и', 'И', 'о', 'О', 'у', 'У', 'ы', 'Ы', 'э', 'Э', 'ю', 'Ю', 'я', 'Я');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }
}
