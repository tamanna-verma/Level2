class Solution 
{
    public boolean canArrange(int[] arr, int k)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
         
         for(int val:arr)
         {
             int remainder=((val%k) +k)%k;
           
              int freq=map.getOrDefault(remainder,0);
               map.put(remainder,freq+1);
           
         }
          for(int val:arr)
         { int remainder=((val%k) +k)%k;
           
             
             if(remainder==0)
             {
              int freq=map.get(remainder);
              if(freq%2!=0)
              {
                  return false;
              }
                 
             }
             else if (remainder*2==k)
             {
              int freq=map.get(remainder);
              if(freq%2!=0)
              {
                  return false;
              } 
             }
             else 
             {
              int freq=map.get(remainder);
              int secondfreq= map.getOrDefault(k-remainder,0);
               if(freq!=secondfreq)
               {
                   return false; 
               }
             }
           
         }
         return true;
        
    }
}
