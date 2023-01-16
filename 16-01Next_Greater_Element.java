class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
         Stack<Long> stack = new Stack<>();
        
        long[] ans = new long[n];
        for(int i=n-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek()<arr[i])
                stack.pop();
                
            if(stack.isEmpty())
                ans[i] = -1;
            else ans[i] = stack.peek();  
            
            stack.push(arr[i]);
        }
        return ans;
    } 
}