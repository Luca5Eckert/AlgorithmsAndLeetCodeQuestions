package leetcode.intersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                duplicate.add(num);
            }
        }

        int[] result = new int[duplicate.size()];
        int i = 0;

        for (int num : duplicate) {
            result[i++] = num;
        }

        return result;
    }
}
