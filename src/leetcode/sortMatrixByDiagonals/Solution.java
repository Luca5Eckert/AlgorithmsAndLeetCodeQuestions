package leetcode.sortMatrixByDiagonals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, PriorityQueue<Integer>> diagonals = new HashMap<>();
        int colls = grid[0].length, rows = grid.length;

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < colls; j++){
                int key = i - j;

                diagonals.putIfAbsent(key, key < 0 ? new PriorityQueue<>()
                        : new PriorityQueue<>(Collections.reverseOrder()) );
                diagonals.get(key).add(grid[i][j]);


            }

        }

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < colls; j++){
                int key = i - j;
                grid[i][j] = diagonals.get(key).poll();
            }


        }

        return grid;


    }

}