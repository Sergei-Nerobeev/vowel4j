package hu.nerbe.v2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelFactory {

  private static final Set<String> SUPPORTED_LANGUAGES = Arrays
      .stream(Locale.getISOLanguages())
      .collect(Collectors.toUnmodifiableSet());

  private static boolean isValidLanguage(String lang) {
    return lang != null && SUPPORTED_LANGUAGES.contains(lang);
  }

  public static VowelCheckable getVowels(String language) {
    if (!isValidLanguage(language)) {
      throw new IllegalArgumentException(
          "Unsupported format: " + language + ". Supported ISO languages format: " + SUPPORTED_LANGUAGES);
    }

    return switch (language) {
      case "ru" -> new VowelRu();
      case "en" -> new VowelEn();
      case "hu" -> new VowelHu();
      default -> throw new IllegalArgumentException("Unsupported language.You can add your language here: " +
                                                        "https://github.com/Sergei-Nerobeev/vowel4j");
    };
  }
}


