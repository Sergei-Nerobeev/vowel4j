package hu.nerbe.utest;

import hu.nerbe.VowelEn;
import hu.nerbe.VowelFactory;
import hu.nerbe.VowelHu;
import hu.nerbe.VowelRu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelFactoryTest {

  @DisplayName("Return correct object for supported languages")
  @Test
  void getVowels_shouldReturnCorrectObject_forSupportedLanguages_test() {
    assertTrue(VowelFactory.getVowels("ru") instanceof VowelRu);
    assertTrue(VowelFactory.getVowels("en") instanceof VowelEn);
    assertTrue(VowelFactory.getVowels("hu") instanceof VowelHu);

  }
  @DisplayName("Not throw exception for supported language")
  @Test
  void getVowels_notShouldThrowException_forSupportedLanguages_test() {

    assertDoesNotThrow(() -> VowelFactory.getVowels("ru"));
    assertDoesNotThrow(() -> VowelFactory.getVowels("en"));
    assertDoesNotThrow(() -> VowelFactory.getVowels("hu"));
  }

  @DisplayName("Should throw exception for unsupported language")
  @Test
  void getVowels_shouldThrowException_forUnsupportedLanguage() {
    assertThrows(IllegalArgumentException.class, () -> VowelFactory.getVowels("de"));
    assertThrows(IllegalArgumentException.class, () -> VowelFactory.getVowels("fr"));
  }

  @DisplayName("Should throw exception for null")
  @Test
  void getVowels_shouldThrowException_forNull() {
    assertThrows(IllegalArgumentException.class, () -> VowelFactory.getVowels(null));
  }
}
