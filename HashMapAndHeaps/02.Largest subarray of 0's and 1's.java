// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}
// } Driver Code Ends




class Solution 
{

    public static int maxLen(int[] arr, int N)
    {
       int sum=0;
       int MaxLength=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       for(int i=0;i<arr.length;i++)
       {
           int val=arr[i];
           if(val==0)
           {
               sum+=-1;
           }
           else
           {
               sum+=1;
           }
           
           if(map.containsKey(sum))
           {
               int x=map.get(sum);
               int currentLength=i-x;
               if(currentLength>MaxLength)
               {
                   MaxLength=currentLength;
               }
           }
           else
           {
               map.put(sum,i);
           }
           
       }
       return MaxLength;
    }
}
