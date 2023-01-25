class Solution {

    int minOperation(String s) {

        // code here

        int i,j,n=s.length();

        int count=0;

        String temp="";

        int val=0;

        boolean flag=false;

        if(s.length()==1)

        return 1;

        for(i=0;i<n;i++)

        {

            temp+=s.charAt(i);

            count++;

          

            boolean found=false;

            String k=s.substring(i+1,Math.min(i+1+temp.length(),n));

            if(k.equals(temp))

            {

                val=Math.max(val,k.length());

            }

        }

       

        return count-val+1;

    }

}