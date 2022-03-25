class Solution {
    public boolean hasGroupsSizeX(int[] deck) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<deck.length;i++)
        {
           int freq=map.getOrDefault(deck[i],0);
            map.put(deck[i],freq+1);            
        }
        int counter=0;
        int gcd=1;
        for(int key:map.keySet())
        {
         if(counter==0)
          {
             gcd=map.get(key);
          }
            else
            {
                gcd=getGCD(gcd,map.get(key));           
            }
            counter++;
        }
        
        return gcd>=2;
        
    }
    
    public static int getGCD(int first, int second)
    {
       
        while(first%second!=0)
        {
         int x=first%second;
         first=second;
         second=x;
        }
        return second;
    }
}
