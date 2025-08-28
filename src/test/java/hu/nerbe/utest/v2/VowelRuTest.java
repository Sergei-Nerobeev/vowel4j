package hu.nerbe.utest.v2;

import hu.nerbe.v2.VowelRu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelRuTest {

  VowelRu vowelRu = new VowelRu();

  @DisplayName("Valid Vowels Ru")
  @ParameterizedTest
  @ValueSource(
      chars = {'а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я'})
  void testValidVowelRu(char vowel) {

    assertTrue(vowelRu.isVowel(vowel));

  }

  @DisplayName("Invalid Consonants Ru")
  @ParameterizedTest
  @ValueSource(
      chars = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'})
  void testInvalidConsonantRu(char consonant) {

    assertFalse(vowelRu.isVowel(consonant));
  }

  @DisplayName("Invalid Symbols")
  @ParameterizedTest
  @ValueSource(
      chars = {
          ' ', '.', ',', ';', ':', '?', '!', '—', '-', '(', ')', '[', ']', '{', '}', '<', '>',
          '/', '|', '@', '#', '$', '%', '^', '&', '*', '+', '=', '~', '`', '_'
      })
  void testInvalidSymbolRu(char symbol) {

    assertFalse(vowelRu.isVowel(symbol));
  }
}
