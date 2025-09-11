package hu.nerbe.utest;

import hu.nerbe.VowelFactory;
import hu.nerbe.VowelRu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelRuTest {

  VowelRu vowelRu = new VowelRu();

  @DisplayName("Valid Vowels Ru")
  @ParameterizedTest
  @ValueSource(
      chars = {'а', 'е', 'ё', 'и', 'й', 'у', 'ы', 'э', 'ю', 'я', 'о'})
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

  @DisplayName("Checking String word with RU")
  @Test
  void testWithStringWord() {
    var ru = VowelFactory.getVowelChecker("ru");
    String chekWord = "ворона";
    for (char ch : chekWord.toCharArray()) {
      boolean result = ru.isVowel(ch);
      System.out.println(result);
    }

  }
}
