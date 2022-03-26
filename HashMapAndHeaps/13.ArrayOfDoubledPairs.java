class Solution
{
    public boolean canReorderDoubled(int[] arr) 
    {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            {
             int freq=map.getOrDefault(arr[i],0);
             map.put(arr[i],freq+1);
            
            }
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])&& map.containsKey(2*arr[i]))
            {
              int freq=map.get(arr[i]);
                int doublefreq=map.get(2*arr[i]);
                
                if(freq==1)
                {
                    map.remove(arr[i]);
                }
                else{
                    map.put(arr[i],freq-1);
                }
                
                 if(doublefreq==1)
                {
                    map.remove(2*arr[i]);
                }
                else{
                    map.put(2*arr[i],doublefreq-1);
                }
            }
        }
        
        return map.size()==0;
    }
}
