package hu.nerbe.utest.v2;

import hu.nerbe.v2.VowelEn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelEnTest {
  VowelEn vowelEn = new VowelEn();

  @DisplayName("Invalid Vowels En")
  @ParameterizedTest
  @ValueSource(
      chars = {'a', 'e', 'i', 'o', 'u', 'y'})
  void testInvalidVowelEn(char vowel) {

    assertTrue(vowelEn.isVowel(vowel));
  }

  @DisplayName("Invalid Consonants En")
  @ParameterizedTest
  @ValueSource(
      chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'})
  void testInvalidConsonantEn(char consonant) {

    assertFalse(vowelEn.isVowel(consonant));
  }

  @DisplayName("Invalid Symbols")
  @ParameterizedTest
  @ValueSource(
      chars = {
          ' ', '.', ',', ';', ':', '?', '!', '—', '-', '(', ')', '[', ']', '{', '}', '<', '>',
          '/', '|', '@', '#', '$', '%', '^', '&', '*', '+', '=', '~', '`', '_'
      })
  void testInvalidSymbolRu(char symbol) {

    assertFalse(vowelEn.isVowel(symbol));
  }
}
