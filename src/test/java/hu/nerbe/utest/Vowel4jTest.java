package hu.nerbe.utest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static hu.nerbe.Vowel4j.isVowelRu;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Vowel4jTest {

  @DisplayName("ValidVowelRu")
  @ParameterizedTest
  @ValueSource(
      chars = {'а', 'е', 'ё', 'и', 'у', 'ы', 'э', 'ю', 'я'})
  void testValidVowelRu(char vowel) {

    assertTrue(isVowelRu(vowel));
  }

  @DisplayName("InvalidConsonantRu")
  @ParameterizedTest
  @ValueSource(
      chars = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'})
  void testInvalidConsonantRu(char consonant) {

    assertFalse(isVowelRu(consonant));
  }

  @DisplayName("InvalidSymbolRu")
  @ParameterizedTest
  @ValueSource(
      chars = {
          ' ', '.', ',', ';', ':', '?', '!', '—', '-', '(', ')', '[', ']', '{', '}', '<', '>',
          '/', '|', '@', '#', '$', '%', '^', '&', '*', '+', '=', '~', '`', '_'
      })
  void testInvalidSymbolRu(char symbol) {

    assertFalse(isVowelRu(symbol));
  }

  @DisplayName("InvalidVowelEn")
  @ParameterizedTest
  @ValueSource(
      chars = {'a', 'e', 'i', 'o', 'u', 'y'})
  void testInvalidVowelEn(char vowelEn) {

    assertFalse(isVowelRu(vowelEn));
  }

  @DisplayName("InvalidConsonantEn")
  @ParameterizedTest
  @ValueSource(
      chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'})
  void testInvalidConsonantEn(char consonantEn) {

    assertFalse(isVowelRu(consonantEn));
  }

  @DisplayName("InvalidVowelHu")
  @ParameterizedTest
  @ValueSource(
      chars = {'a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű'})
  void testInvalidVowelHu(char vowelHu) {

    assertFalse(isVowelRu(vowelHu));
  }

  @DisplayName("InvalidConsonantHu")
  @ParameterizedTest
  @ValueSource(
      chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'})
  void testInvalidConsonantHu(char consonantHu) {

    assertFalse(isVowelRu(consonantHu));
  }

}
