class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;
        int consLate = 0;
        
        for(char att : s.toCharArray()){
            if(att != 'L') consLate = 0;
            if(att == 'P') continue;
            
            if(att == 'L') {
                consLate++;
                if(consLate == 3) return false;
            }
            
            if(att == 'A'){
                absents++;
                
                if(absents >= 2) return false;
            }
            
        }
        
        return true;
    }
}