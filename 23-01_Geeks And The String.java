class Solution {
    public static String removePair(String s) {
        // code here
        if(s.length()==0)
            return "-1";
        if(s.length()==1)
            return s;
            
        if(s.charAt(1)==s.charAt(0)){
            s = removePair(s.substring(2));
            return s;
        }    
            
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s = removePair(s.substring(0,i-1)+s.substring(i+1));
                break;
            }
        } 
        return s;
    }
}