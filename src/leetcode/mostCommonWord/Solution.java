package leetcode.mostCommonWord;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> mostFrequence = new HashMap<>();
        String wordMostFrequence = "";
        int maxFrequence = 0;

        String[] words = paragraph.toLowerCase().split("[\\p{Punct}\\s]+");

        for(int i = 0; i < words.length; i++){

            String word = words[i];

            if(!palavraFoiBanida(word, banned)){

                int frequence = mostFrequence.getOrDefault(word, 0);

                frequence++;
                mostFrequence.put(word, frequence);

                if(frequence > maxFrequence){
                    wordMostFrequence = word;
                    maxFrequence = frequence;
                }

            }

        }

        return wordMostFrequence;


    }


    public boolean palavraFoiBanida(String palavra, String[] palavrasBanidas){
        for(int i = 0; i < palavrasBanidas.length; i++){

            if(palavra.equals(palavrasBanidas[i])){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String response = solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
        System.out.println(response);
    }


}