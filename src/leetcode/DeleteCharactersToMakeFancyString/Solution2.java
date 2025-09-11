package leetcode.DeleteCharactersToMakeFancyString;

public class Solution2 {

    public String makeFancyString(String s) {
        int sLength = s.length();
        StringBuilder newString = new StringBuilder();
        int sequence = 0;

        for(int i = 0; i < sLength; i++){
            char characterActual = s.charAt(i);

            if(i > 0 && characterActual == s.charAt(i-1) ){
                if(sequence < 2){
                    newString.append(characterActual);
                    sequence++;
                }
            } else {
                newString.append(characterActual);
                sequence = 1;
            }



        }

        return newString.toString();
    }
}
