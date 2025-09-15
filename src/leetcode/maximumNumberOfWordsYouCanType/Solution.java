package leetcode.maximumNumberOfWordsYouCanType;

class Solution {
	
    public int canBeTypedWords(String text, String brokenLetters) {
        int actualWord = 0;
        int numberWords = 0;
        
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if(c == ' '){
                if(actualWord == 0){
                    numberWords++;
                }
                actualWord = 0;
            }

            if(containsTheWord(c, brokenLetters)){
               actualWord++; 
            }
        
        }

        return numberWords;
    }

    public boolean containsTheWord(char c, String brokenLetters){
        return brokenLetters.indexOf(c) != -1;
    }
    
    public static void main(String[] args) {
		
    	Solution s = new Solution();
    	
    	s.canBeTypedWords("leet code", "lt");
    	
	}
}