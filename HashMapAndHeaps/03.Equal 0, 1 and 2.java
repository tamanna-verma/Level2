// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    public static long getSubstringWithEqual012(String str) 
    { 
        int count0=0;
        int count1=0;
        int count2=0;
        String key ="0#0";
        HashMap<String,Integer> map=new HashMap<>();
        map.put(key,1);
        int ans=0;
        char[]arr=str.toCharArray();
        for(char val:arr)
        {
            if(val=='0')
            {
              count0++;  
            }
            else if(val=='1')
            {
            count1++;    
            }
            else
            {
               count2++; 
            }
            key=(count1-count0)+"#"+(count2-count1);
            if(map.containsKey(key))
            {
            
            int x=map.get(key);
            ans+=x;
            map.put(key,x+1);
            }
            else{
                map.put(key,1);
            }
            
        }
        return ans;
        
    }
} 
