package threeConsecutiveOdds;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int sequenceOdd = 0;

        for(int i = 0; i < arr.length; i++){
            int number = arr[i];

            if(!(number % 2 == 0) ){
                sequenceOdd++;
            } else {
                sequenceOdd = 0;
            }

            if(sequenceOdd >= 3){
                return true;
            }
        }

        return false;

    }
}