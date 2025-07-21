package DeleteCharactersToMakeFancyString;

public class Solution2 {

    public String makeFancyString(String s) {
        int sLength = s.length();
        StringBuilder newString = new StringBuilder();
        int i = 0;

        while( i < sLength){
            int j = i;
            char currentChar = s.charAt(i);

            while( j < sLength && currentChar == s.charAt(j)){
                j++;
            }

            if( j - i > 1 ){
                newString.append(currentChar);
                newString.append(currentChar);
            } else {
                newString.append(currentChar);
            }

            i = j;

        }

        String correct = newString.toString();
        return correct;

    }
}
