package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSumForceBrute(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){

            for( int e = i+1; e < nums.length; e++){

                if( nums[i] + nums[e] == target) return new int[]{i, e};
            }

        }
        return null;
    }

    public static int[] twoSumForceBruteDiferent(int[] nums, int target) {
        for(int i = 1; i < nums.length;i++){

            for( int e = i; e < nums.length; e++){

                if( nums[e] + nums[e-i] == target) return new int[]{e, e-i};
            }

        }
        return null;
    }

    public static int[] twoSumHashTable(int[] nums, int target){
        Map<Integer, Integer> table = new HashMap<>();
        int size = nums.length;

        for(int i = 0; i < size; i++){
            table.put(nums[i], i);
        }

        for(int i = 0; i < size; i++){
            int numberLeft =  target - nums[i];

            if(table.containsKey(numberLeft) && table.get(numberLeft) != i){
                return new int[]{i, table.get(numberLeft)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] listTest = {3,2,4};
        int targetTest = 6;

        var resultForceArray = twoSumForceBrute(listTest, targetTest);
        var resultHashArray = twoSumHashTable(listTest, targetTest);

        int resultForce = listTest[resultForceArray[0]] + listTest[resultForceArray[1]];
        int resultHash = listTest[resultHashArray[0]] + listTest[resultHashArray[1]];

        int resultExpected = targetTest;


        if(resultExpected == resultForce){
            System.out.println("Force correct");
        }

        if(resultExpected == resultHash ){
            System.out.println("Hash correct");
        }

    }
}