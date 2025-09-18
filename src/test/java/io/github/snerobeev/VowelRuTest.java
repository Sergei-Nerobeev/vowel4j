package io.github.snerobeev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VowelRuTest {

  VowelRu vowelRu = new VowelRu();

  @DisplayName("Valid Vowels Ru")
  @ParameterizedTest
  @ValueSource(
      chars = {'а', 'А', 'е', 'Е', 'ё', 'Ё', 'и', 'И', 'о', 'О', 'у', 'У', 'ы', 'Ы', 'э', 'Э', 'ю', 'Ю', 'я', 'Я'})
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

  @DisplayName("Checking Sentence Positive RU")
  @Test
  void testWithSentencePositiveRu() {
    var ru = VowelFactory.getVowelChecker("ru");
    String chekWord = "СъешЬ ещё-Этих мЯгких фрАнцузских булок! да выпей чаЮ.";
    boolean[] expected = {
        false, false, true, false, false, false, true, false, true, false, true, false, true, false, false,
        false, true, false, false, true, false, false, false, false, true, false, false, true, false, false, false,
        true, false,
        false, false, true, false, true, false, false, false, false, true, false, false, true, false, true, false,
        false,
        false, true, true, false
    };
    int i = 0;

    for (char ch : chekWord.toCharArray()) {
      boolean actual = ru.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }

  @DisplayName("Mix char RU EN HU positive test")
  @ParameterizedTest
  @ValueSource(
      strings = {"А роза go=önéK?"})
  void testMixCharRuEnHuPositive(String sentence) {
    var ru = VowelFactory.getVowelChecker("ru");
    boolean[] expected =
        {true, false, false, true, false, true, false, false, false, false, false, false, false, false, false};
    int i = 0;

    for (char ch : sentence.toCharArray()) {
      boolean actual = ru.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;
    }
  }

}
