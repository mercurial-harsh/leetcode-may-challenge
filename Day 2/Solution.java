class Solution {
    public int numJewelsInStones(String J, String S) {
        
        if (J.length()<=50 && S.length()<=50){
                int count=0;
                char[] Jchars =J.toCharArray();
            for(char r : Jchars){
                
                for (int i=0; i<S.length();i++){
                    if(r==(S.charAt(i))){
                        count++;
                    }
                }
            }
            
            return count;
            
        }
        return -1;
    }
}