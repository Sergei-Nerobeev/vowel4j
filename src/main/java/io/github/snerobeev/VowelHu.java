package io.github.snerobeev;

import java.util.Set;

/**
 * @author Sergei Nerobeev
 * @version 1.0.1
 * @see VowelCheckable
 * @since 2025-09-15
 */

public class VowelHu implements VowelCheckable {
  public static final Set<Character>
      VOWELS = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'ö', 'Ö', 'u', 'U', 'ü', 'Ü', 'á', 'Á', 'é', 'É',
                      'í', 'Í', 'ó', 'Ó', 'ő', 'Ő', 'ú', 'Ú', 'ű', 'Ű');

  @Override
  public boolean isVowel(char ch) {
    return VOWELS.contains(ch);
  }
}
