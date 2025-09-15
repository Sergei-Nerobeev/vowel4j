package hu.nerbe;

/**
 * @author Sergei Nerobeev
 * @version 1.0.1
 * @see VowelCheckable
 * @since 2025-09-15
 * Defines a contract for vowel-checking services.
 * This interface is used to abstract the logic of vowel identification,
 * allowing for different implementations for various languages.
 */

public interface VowelCheckable {
  /**
   * Checks if a given character is a vowel.
   * The definition of a vowel is specific to the implementing class's language rules.
   *
   * @param ch The character to check.
   * @return {@code true} if the character is a vowel; {@code false} otherwise.
   */

  boolean isVowel(char ch);
}
