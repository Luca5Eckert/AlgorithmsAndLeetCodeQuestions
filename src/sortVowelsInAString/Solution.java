package sortVowelsInAString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        if(s.length() <= 1) return s;

        List<Character> vogais = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (eVogal(c)) {
                vogais.add(c);
            }
        }

        Collections.sort(vogais);

        if(vogais.isEmpty()) return s;

        StringBuilder builder = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()){

            if(eVogal(c)){
                builder.append(vogais.get(i));
                i++;
            } else {
                builder.append(c);
            }
        }

        return builder.toString();

    }


    public static boolean eVogal(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}