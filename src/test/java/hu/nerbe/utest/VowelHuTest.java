package hu.nerbe.utest;

import hu.nerbe.VowelFactory;
import hu.nerbe.VowelHu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelHuTest {
  VowelHu vowelHu = new VowelHu();

  @DisplayName("InvalidVowelHu")
  @ParameterizedTest
  @ValueSource(
      chars = {'a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű'})
  void testInvalidVowelHu(char vowel) {

    assertTrue(vowelHu.isVowel(vowel));
  }

  @DisplayName("InvalidConsonantHu")
  @ParameterizedTest
  @ValueSource(
      chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'})
  void testInvalidConsonantHu(char consonant) {

    assertFalse(vowelHu.isVowel(consonant));
  }

  @DisplayName("Invalid Symbols")
  @ParameterizedTest
  @ValueSource(
      chars = {
          ' ', '.', ',', ';', ':', '?', '!', '—', '-', '(', ')', '[', ']', '{', '}', '<', '>',
          '/', '|', '@', '#', '$', '%', '^', '&', '*', '+', '=', '~', '`', '_'
      })
  void testInvalidSymbolRu(char symbol) {

    assertFalse(vowelHu.isVowel(symbol));
  }

  @DisplayName("Checking String word HU")
  @Test
  void testWithStringWord() {
    var hu = VowelFactory.getVowelChecker("hu");
    String wordHu = "északi";
    boolean[] expected = {true, false, false, true, false, true};
    int i = 0;

    for (char ch : wordHu.toCharArray()) {
      boolean actual = hu.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }
}
