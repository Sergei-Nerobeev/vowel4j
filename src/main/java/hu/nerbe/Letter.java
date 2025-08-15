package hu.nerbe;

import java.util.Set;

public class Letter {

  public static boolean isVowelRu(char letter) {
    Set<Character> vowels = Set.of('а', 'е', 'ё', 'и', 'у', 'ы','э', 'ю', 'я');
    return vowels.contains(letter);
  }

  public static boolean isVowelEn(char letter) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
    return vowels.contains(letter);
  }

  public static boolean isVowelHu(char letter) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'ö', 'u', 'ü', 'á', 'é', 'í', 'ó', 'ő', 'ú', 'ű');
    return vowels.contains(letter);
  }

}
