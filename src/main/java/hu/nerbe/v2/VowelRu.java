package hu.nerbe.v2;

import java.util.Set;

public class VowelRu implements Vowel {
  @Override
  public boolean isVowel(char ch) {
    Set<Character> vowels = Set.of('а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я');
    return vowels.contains(ch);
  }
}
