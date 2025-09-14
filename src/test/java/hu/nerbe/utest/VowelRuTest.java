package hu.nerbe.utest;

import hu.nerbe.VowelFactory;
import hu.nerbe.VowelRu;
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
      chars = {'а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я', 'о'})
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
    String chekWord = "Съешь ещё этих мягких французских булок, да выпей чаю.";
    boolean[] expected = {
//        С       ъ     е     ш       ь           е      щ     ё            э      т     и    х
        false, false, true, false, false, false, true, false, true, false, true, false, true, false, false,
//        м     я      г      к      и     х              ф     р      а      н    ц      у     з      с       к     и     х
        false, true, false, false, true, false, false, false, false, true, false, false, true, false, false, false, true, false,
//              б      у      л      о     к      ,             д      а            в     ы     п       е     й
        false, false, true, false, true, false, false, false, false, true, false, false, true, false, true, false, false,
//        ч      а     ю
        false, true, true, false
    };
    int i = 0;

    for (char ch : chekWord.toCharArray()) {
      boolean actual = ru.isVowel(ch);

      Assertions.assertEquals(expected[i], actual);
      i++;

    }

  }
}
