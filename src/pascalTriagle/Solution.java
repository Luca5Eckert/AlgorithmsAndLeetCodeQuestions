package pascalTriagle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        if(numRows == 0){
            return pascal;
        }

        if(numRows == 1){
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            pascal.add(firstRow);
            return pascal;
        }

        pascal = generate(numRows-1);
        List<Integer> prevList = pascal.get(numRows-2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for(int i = 1; i < numRows-1; i++){
            int number = prevList.get(i-1) + prevList.get(i);
            currentRow.add(number);
        }

        currentRow.add(1);
        pascal.add(currentRow);

        return pascal;


    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int test = 4;

        String resultExpected = "bb";

        List<List<Integer>> result = s.generate(4);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }

}
