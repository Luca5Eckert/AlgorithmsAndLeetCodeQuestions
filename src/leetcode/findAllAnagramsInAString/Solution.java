package leetcode.findAllAnagramsInAString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> frequence = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char c = p.charAt(i);
            frequence.put(c, frequence.getOrDefault(c, 0) + 1);
        }


        int l = 0, j = 0;
        int count = frequence.size();
        int n = s.length();

        while(j < n){

            char c = s.charAt(j);

            if(frequence.containsKey(c)){
                frequence.put(c, frequence.get(c) - 1);
                if(frequence.get(c) == 0) count--;
            }

            if(j - l + 1> p.length()){
                char ch = s.charAt(l);

                if(frequence.containsKey(ch)){

                    if(frequence.get(ch) == 0) count++;

                    frequence.put(ch, frequence.get(ch) + 1);

                }

                l++;
            }

            if(j - l + 1 == p.length() && count == 0){
                list.add(l);
            }

            j++;

        }

        return list;

    }
}