class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      int release=0;
      int acquire=k;
      ArrayList<Integer> AL=new ArrayList<>();
      for(int i=0;i<k;i++)
      {
          int freq=map.getOrDefault(A[i],0);
          map.put(A[i],freq+1);
      }
      for(int i=0;i<=A.length-(k);i++)
      {
          AL.add(map.size());
          //acquire,release
          
          if(acquire<=A.length-1)
          {
          int freq=map.getOrDefault(A[acquire],0);
          map.put(A[acquire],freq+1);
          acquire++;  
          }
          
          //acquire
          
          int freq=map.getOrDefault(A[release],0);
          if(freq==1)
          {
              map.remove(A[release]);
          }
          else
          {
                map.put(A[release],freq-1);
          }
        
          release++;
         
      }
        return AL;
    }
}

