package leetcode.countElementsWithMaximumFrequency;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequence = 0;
        Map<Integer, Integer> frequences = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            int frequence = frequences.getOrDefault(num, 0) + 1;
            frequences.put(num, frequence);

            if(maxFrequence < frequence){
                maxFrequence = frequence;
            }

        }

        int result = 0;
        for(Map.Entry<Integer,Integer> entrada : frequences.entrySet()){
            if(entrada.getValue() == maxFrequence) result ++;
        }

        return result * maxFrequence;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = new int[]{1,2,2,3,1,4};

        int result = s.maxFrequencyElements(nums);
        System.out.println(result);
    }
}