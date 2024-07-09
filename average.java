class Solution {
    public double averageWaitingTime(int[][] arr) 
    {
        int n=arr.length;
        int tot=0;
        long wt=0;
           for(int i=0;i<n;i++)
           {
                if(tot<arr[i][0])
                {
                
                    tot=(arr[i][0]+arr[i][1]);
                    wt+=(tot-arr[i][0]);
                }
                else
                {
                    tot+=arr[i][1];
                    wt+=(tot-arr[i][0]);
                }
           }
           double ans=(double)wt/n;
           return ans;


    }
}