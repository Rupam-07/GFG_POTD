class Solution{

    public int maxWeightCell(int N, int Edge[]){

       int weight[] = new int[N];

       Arrays.fill(weight,0);

       for(int i=0 ; i<N ; i++){

           if(Edge[i]!=-1){

               weight[Edge[i]]+=i;

           }

       }

       int max_weight= Integer.MIN_VALUE;

       int max_index= Integer.MIN_VALUE;

       for(int i=0;i<N;i++){

           if(weight[i]>max_weight){

               max_weight=weight[i];

               max_index=i;

           }

           else if(weight[i]==max_weight){

               max_index=Math.max(max_index,i);

           }

       }

       return max_index;

    }

 

}