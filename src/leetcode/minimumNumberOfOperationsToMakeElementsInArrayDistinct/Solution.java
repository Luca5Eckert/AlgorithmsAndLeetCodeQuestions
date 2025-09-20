package leetcode.minimumNumberOfOperationsToMakeElementsInArrayDistinct;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length <= 1) return 0;

        int start = 0;
        int end = nums.length - 1;
        int qtdOperations = 0;

        while(start <= end){
            Set<Integer> numbers = new HashSet<>();

            for(int i = start ;  i <= end; i++){
                int num = nums[i];

                if(!numbers.contains(num)){
                    numbers.add(num);
                    continue;
                }

                numbers = new HashSet<>();
                break;
            }
            if(numbers.isEmpty()){
                qtdOperations++;
                start += 3;
                continue;
            } else {
                return qtdOperations;
            }

        }

        return qtdOperations;

    }
}