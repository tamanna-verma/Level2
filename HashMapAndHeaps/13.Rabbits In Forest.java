class Solution
{
    public int numRabbits(int[] answers) 
    {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
          for(int i=0;i<answers.length;i++)
          {
              int freq=map.getOrDefault(answers[i],0);
              map.put(answers[i],freq+1);
          }
        
    
    
    for(int key:map.keySet())
    {
        int freq=map.get(key);
        ans+=(int)Math.ceil(freq*1.0/(key+1 *1.0))*(key+1);
            
    }
    return ans;
    }
}
