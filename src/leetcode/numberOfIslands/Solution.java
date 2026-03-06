package leetcode.numberOfIslands;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int numIslands(char[][] grid) {
        int counterIslands = 0;
        Set<String> knows = new HashSet<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                char value = grid[i][j];
                String position = "["+ i + "," + j + "]";

                if(knows.contains(position)){
                    continue;
                }

                knows.add(position);

                if(value=='1'){
                    counterIslands++;

                    recursiveSearch(grid, knows, i, j);
                }

            }
        }

        return counterIslands;
    }

    private void recursiveSearch(char[][] grid, Set<String> knows, int x, int y){
        // BFS
        if(x - 1 >= 0){
            char value = grid[x - 1][y];
            String position = "["+ (x - 1) + "," + y + "]";

            if(!knows.contains(position)){
                knows.add(position);
                if(value == '1'){
                    recursiveSearch(grid, knows, x-1, y);
                }
            }


        }

        if(x + 1 < grid.length){
            char value = grid[x + 1][y];
            String position = "["+ (x + 1) + "," + y + "]";

            if(!knows.contains(position)){
                knows.add(position);
                if(value == '1'){
                    recursiveSearch(grid, knows, x+1, y);
                }
            }
        }

        // DFS
        if(y - 1 >= 0){
            char value = grid[x][y - 1];
            String position = "["+ x + "," + (y-1) + "]";

            if(!knows.contains(position)){
                knows.add(position);
                if(value == '1'){
                    recursiveSearch(grid, knows, x, y - 1);
                }
            }
        }

        if(y + 1 < grid[x].length){
            char value = grid[x][y + 1];
            String position = "["+ x + "," + (y+1) + "]";

            if(!knows.contains(position)){
                knows.add(position);
                if(value == '1'){
                    recursiveSearch(grid, knows, x, y + 1);
                }
            }
        }



    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        Solution solution = new Solution();

        System.out.println(solution.numIslands(grid));

    }
}
