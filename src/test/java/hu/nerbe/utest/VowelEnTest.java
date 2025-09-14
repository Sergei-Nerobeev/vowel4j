package hu.nerbe.utest;

import hu.nerbe.VowelEn;
import hu.nerbe.VowelFactory;
import org.junit.jupiter.api.Assertions;
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

  @DisplayName("Checking Sentence Positive EN")
  @Test
  void testWithSentencePositiveEn() {
    var en = VowelFactory.getVowelChecker("en");
    String wordEn = "The quick brown fox jumps over the lazy dog.";
    boolean[] expected =
        {
            // T     h      e          q      u     i      c      k              b      r     o     w      n
            false, false, true, false, false, true, true, false, false, false, false, false, true, false, false, false,
            // f    o      x             j       u     m     p     s              o      v     e     r
            false, true, false, false, false, true, false, false, false, false, true, false, true, false, false,
            // t     h     e            l       a     z     y             d     o     g
            false, false, true, false, false, true, false, true, false, false, true, false, false
        };

    int i = 0;

    for (char ch : wordEn.toCharArray()) {
      boolean actual = en.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }

}
