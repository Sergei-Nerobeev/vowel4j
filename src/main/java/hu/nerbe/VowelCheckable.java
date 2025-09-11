package hu.nerbe;

/**
 * Defines a contract for vowel-checking services.
 * <p>
 * This interface is used to abstract the logic of vowel identification,
 * allowing for different implementations for various languages.
 */
public interface VowelCheckable {
  /**
   * Checks if a given character is a vowel.
   * <p>
   * The definition of a vowel is specific to the implementing class's language rules.
   *
   * @param ch The character to check.
   * @return {@code true} if the character is a vowel; {@code false} otherwise.
   */
  boolean isVowel(char ch);
}
