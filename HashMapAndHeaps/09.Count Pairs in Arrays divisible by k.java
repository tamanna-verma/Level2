class Solution
{
    public static int countKdivPairs(int arr[], int n, int k)
    {
      
      
       HashMap<Integer,Integer> map=new HashMap<>();
         
         for(int val:arr)
         {
             int remainder=(val)%k;
           
              int freq=map.getOrDefault(remainder,0);
               map.put(remainder,freq+1);
           
         }
       int ans=0;
       for(int i=0;i<=k/2;i++)
       {
           if(i==0)
           {
               int freq=map.getOrDefault(i,0);
               ans+=(freq*(freq-1))/2;
           }
           else if(i*2==k)
           {
             int freq=map.getOrDefault(i,0);
              ans+=(freq*(freq-1))/2;
           }
           else
           {
               int freq=map.getOrDefault(i,0);
               int secondfreq=map.getOrDefault(k-i,0);
               ans+=(freq*secondfreq);
           }
       }
         return ans;
      
    }
}
