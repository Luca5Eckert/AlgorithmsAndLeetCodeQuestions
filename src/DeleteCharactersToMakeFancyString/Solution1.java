package DeleteCharactersToMakeFancyString;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public String makeFancyString(String s) {
        int sLength = s.length();
        StringBuilder newString = new StringBuilder();

        Set<Character> tableValues = new HashSet<>();
        int sequence = 0;

        for(int i = 0; i < sLength; i++){
            char characterActual = s.charAt(i);

            if(tableValues.contains(characterActual)){
                sequence++;
                if(sequence >= 3){
                    sequence--;
                } else {
                    newString.append(characterActual);
                }
            } else {
                tableValues.clear();
                tableValues.add(characterActual);
                sequence = 1;
                newString.append(characterActual);
            }



        }

        return newString.toString();
    }

}
