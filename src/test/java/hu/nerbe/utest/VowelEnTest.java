package hu.nerbe.utest;

import hu.nerbe.VowelEn;
import hu.nerbe.VowelFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

  @DisplayName("Checking String word EN")
  @Test
  void testWithStringWord() {
    var en = VowelFactory.getVowelChecker("en");
    String wordHu = "version";
    for (char ch : wordHu.toCharArray()) {
      boolean result = en.isVowel(ch);
      System.out.println(result);
    }
  }
}
