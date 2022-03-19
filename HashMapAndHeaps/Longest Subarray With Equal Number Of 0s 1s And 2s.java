import java.util.*;

public class Main {

    public static int solution(int[] arr)
    {
         int count0=0;
        int count1=0;
        int count2=0;
        String key ="0#0";
        HashMap<String,Integer> map=new HashMap<>();
        map.put(key,-1);
        
        int length=0;
        int MaxLength=0;
        
      
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            if(val==0)
            {
              count0++;  
            }
            else if(val==1)
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
            length=i-x;
            MaxLength=Math.max(length,MaxLength);
            
            }
            else{
                map.put(key,i);
            }
            
        }
        return MaxLength;
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
