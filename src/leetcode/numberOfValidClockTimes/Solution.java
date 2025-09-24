package leetcode.numberOfValidClockTimes;

class Solution {
    public int countTime(String time) {
        if(time.equals("??:??")) return 1440;

        int result = 1;

        if(time.charAt(0) == '?' && time.charAt(1) == '?'){
            result *= 24;
        } else if(time.charAt(0) == '?'){
            result *= (time.charAt(1) - '0' >= 4) ? 2 : 3;
        } else if(time.charAt(1) == '?'){
            result *= (time.charAt(0) - '0' == 2) ? 4 : 10;
        }


        if(time.charAt(3) == '?'){
            result *= 6;
        }
        if(time.charAt(4) == '?'){
            result *= 10;
        }
        return result;


    }
}