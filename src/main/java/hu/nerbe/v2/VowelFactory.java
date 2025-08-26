package hu.nerbe.v2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelFactory {

  private static final Set<String> SUPPORTED_LANGUAGES = Arrays
      .stream(Locale.getISOLanguages())
      .collect(Collectors.toSet());

  private static boolean isValidLanguage(String lang) {
    return SUPPORTED_LANGUAGES.contains(lang);
  }

  public static Vowel checkVowels(String language) {
    if (!isValidLanguage(language)) {
      throw new IllegalArgumentException("Unsupported language: " + language);
    }
    switch (language) {
      case "ru":
        return new VowelRu();
      case "en":
        return new VowelEn();
      case "hu":
        return new VowelHu();
      default:
        return new VowelEn();
    }
  }
}


