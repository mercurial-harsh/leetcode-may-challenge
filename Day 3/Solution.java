import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.equals(magazine)){
            return true;
        }
        
        if(ransomNote.length()<=magazine.length()){
        
        
        
        char[] j=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        int count=0;
        
        for (char jj : j){
            
            for(int i=0;i<m.length;i++){
                if( jj==(m[i]) ){
                    m[i]='0';count++;break;
                }
            }
            
        }
            if(count==ransomNote.length()){
                return true;
            }
            return false;
        
        
       
    }return false; 
        
    }}
