class Solution {
    static int minRepeats(String A, String B) {
        int count=1;   
        String rep =A;
        while(rep.length() < B.length()){
            rep+=A;
            count++;
        }
        if(rep.contains(B)){
            return count;
        }
        rep+=A;
        if(rep.contains(B)) return count+1;
        return -1;
    }
};