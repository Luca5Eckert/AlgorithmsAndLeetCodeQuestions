package leetcode.findClosestPerson;

class Solution {
    public int findClosest(int x, int y, int z) {
        int distance1 = Math.abs(x-z);
        int distance2 = Math.abs(y-z);

        if(distance1 == distance2) return 0;

        if(distance1 < distance2){
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findClosest(2, 5, 6));
    }
}