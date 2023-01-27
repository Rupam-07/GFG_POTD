class Solution {

    int mod = (int)(1e9 + 7);
    Integer[] dp = new Integer[10001];
    
    public int CountWays(String str){
        int len = str.length();
        //base case
        if(len == 0) return 1;
        if(str.charAt(0) == '0') return 0;
        
        if(dp[len] != null) return dp[len];
        
        int ans = CountWays(str.substring(1));
        // checking for legit letter 
        if(len > 1 && Integer.parseInt(str.substring(0, 2)) < 27){
            ans = (ans + CountWays(str.substring(2)))%mod;
        }
        return dp[len] = ans;
    }

}