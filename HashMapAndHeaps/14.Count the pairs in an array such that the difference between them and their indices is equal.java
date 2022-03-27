import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
class GFG 
{
	public static void main (String[] args) 
	{
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    	    arr[i]=scan.nextInt();
    	}
    	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<n;i++)
    	{
    	   int freq=map.getOrDefault(arr[i]-i,0);
    	   map.put(arr[i]-i,freq+1);
    	   
    	}
    	int ans=0;
    	for(int value:map.values())
    	{
    	  
    	    ans+=(((value)*(value-1))/2);
    	}
    	System.out.println(ans);
	
	}
}
