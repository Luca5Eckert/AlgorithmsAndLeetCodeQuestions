package leetcode.vowelsGameInAString;

class Solution {
    public boolean doesAliceWin(String s) {
        return doesAliceWinRecursive(s, 0);
    }

    public boolean doesAliceWinRecursive(String s, int turnOf){
        if(s == null) return checkWhoWons(turnOf);

        int n = s.length();
        int qtdVogals = 0;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            if(isVogal(c)){
                qtdVogals++;

                if(turnOf == 1 && qtdVogals % 2 == 0){
                    return doesAliceWinRecursive(s.substring(i, n), 0);
                } else if(turnOf == 0 && qtdVogals % 2 != 0){
                    return doesAliceWinRecursive(s.substring(i, n), 1);
                }
            }
        }

        return checkWhoWons(turnOf);

    }

    public boolean checkWhoWons(int turnOf){
        return turnOf == 1;
    }

    public boolean isVogal(char c){
        return "aeiou".indexOf(c) != -1;
    }




}