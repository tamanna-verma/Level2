// { Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



class Solution
{
    long subCount(long arr[] ,int n,int k)
    {
        HashMap<Long,Long> map=new HashMap<>();
      
        
        long sum=0;
        int ans=0;
        //hume map me store krna hai sum%k
          map.put(sum,1L);//0 remainder ek bar aaya hai 
        
        for(int i=0;i<arr.length;i++)
        {
            long val=arr[i];
            sum=sum+val;
            long remainder=sum%k;
            if(remainder<0)
            {
                remainder=remainder+k;
            }
            
            if(map.containsKey(remainder))
            {
                Long freq=map.get(remainder);
                map.put(remainder,freq+1);
                ans+=freq;
                
            }
            else{
                 map.put(remainder,1L);
            }
            
        }
    return ans;
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
    //        int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.subCount(a,n,k);
            System.out.println(ans);
        }
    }
}





  // } Driver Code Ends
