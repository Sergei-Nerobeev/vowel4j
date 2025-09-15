package hu.nerbe;

import java.util.Set;

/**
 * @author Sergei Nerobeev
 * @version 1.0.1
 * @see VowelCheckable
 * @since 2025-09-15
 */

public class VowelHu implements VowelCheckable {
  public static final Set<Character>
      VOWELS = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }
}
