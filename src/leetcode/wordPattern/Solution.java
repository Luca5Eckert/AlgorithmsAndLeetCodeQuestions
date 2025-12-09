package leetcode.wordPattern;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] letters = pattern.toCharArray();

        if (words.length != letters.length) {
            return false;
        }

        Map<Character, String> letterToWord = new HashMap<>();
        Map<String, Character> wordToLetter = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            char currentLetter = letters[i];
            String currentWord = words[i];

            if (letterToWord.containsKey(currentLetter)) {
                if (!letterToWord.get(currentLetter).equals(currentWord)) {
                    return false;
                }
            } else {
                if (wordToLetter.containsKey(currentWord)) {
                    return false;
                }

                letterToWord.put(currentLetter, currentWord);
                wordToLetter.put(currentWord, currentLetter);
            }
        }

        return true;
    }
}