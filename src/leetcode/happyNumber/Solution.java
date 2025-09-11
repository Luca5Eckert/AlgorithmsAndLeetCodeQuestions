package leetcode.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        return isHappyRecursividade(n, numbers);

    }

    public boolean isHappyRecursividade(int n, Set<Integer> numbers){
        if(n == 1) return true;
        if(numbers.contains(n)) return false;

        numbers.add(n);

        int sum = 0;

        while(n > 0){
            int number = (n % 10) * (n % 10);
            sum += number;
            n /= 10;
        }

        if(sum != 1){
            return isHappyRecursividade(sum, numbers);
        }

        return true;
    }
}
