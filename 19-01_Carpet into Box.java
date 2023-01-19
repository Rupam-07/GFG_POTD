class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int count1=0,count2=0;
        int p=A,q=B,r=C,s=D;
        while(q>s)
        {
            q/=2;
            count1++;
        }
        while(r<p){
            p/=2;
            count1++;
        }
        while(B>C)
        {
            B/=2;
            count2++;
        }
        while(D<A){
            A/=2;
            count2++;
        }
        return Math.min(count1,count2);
        
    }
   
}
