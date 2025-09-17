package hu.nerbe.utest;

import hu.nerbe.VowelFactory;
import hu.nerbe.VowelHu;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelHuTest {
  VowelHu vowelHu = new VowelHu();

  @DisplayName("InvalidVowelHu")
  @ParameterizedTest
  @ValueSource(
      chars = {
          'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'ö', 'Ö', 'u', 'U', 'ü', 'Ü', 'á', 'Á', 'é', 'É',
          'í', 'Í', 'ó', 'Ó', 'ő', 'Ő', 'ú', 'Ú', 'ű', 'Ű'
      })
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

  @DisplayName("Checking Sentence Positive HU")
  @Test
  void testWithSentencePositiveHu() {
    var hu = VowelFactory.getVowelChecker("hu");
    String wordHu = "Jámbor, hűs vizek fűtötték a kvártélyt, bőgve.";
    boolean[] expected = {
        false, true, false, false, true, false, false, false, false, true, false, false, false, true, false, true,
        false,
        false, false, true, false, true, false, false, true, false, false, true, false, false, false, true, false,
        false, true,
        false, false, false, false, false, false, true, false, false, true, false

    };
    int i = 0;

    for (char ch : wordHu.toCharArray()) {
      boolean actual = hu.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }

  @DisplayName("Mix char RU EN HU positive test")
  @ParameterizedTest
  @ValueSource(
      strings = "Az úJság(коT)% Female:"
  )
  void testMixCharRuEnHuPositive(String sentence) {
    var hu = VowelFactory.getVowelChecker("hu");
    boolean[] expected =
        {
            true, false, false, true, false, false, true, false, false, false, false, false, false, false, false,
            false, true, false, true, false, true, false
        };
    int i = 0;

    for (char ch : sentence.toCharArray()) {
      boolean actual = hu.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }

}
