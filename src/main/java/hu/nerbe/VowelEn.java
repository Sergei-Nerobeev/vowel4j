package hu.nerbe;

import java.util.Set;

/**
 * @author Sergei Nerobeev
 * @version 1.0.1
 * @see VowelCheckable
 * @since 2025-09-15
 */

public class VowelEn implements VowelCheckable {
  public static final Set<Character> VOWELS = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }

}
