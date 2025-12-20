package leetcode.deleteCollumnsToMakeSorted;

class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int j = strs[0].length();
        int colToDelete = 0;

        for(int i = 0; i < j; i++){
            for(int m = 1; m < n; m++){
                if(strs[m-1].charAt(i) > strs[m].charAt(i)){
                    colToDelete++;
                    break;
                }
            }
        }

        return colToDelete;
    }

    public static void main(String[] args) {
        System.out.println( new Solution().minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }

}