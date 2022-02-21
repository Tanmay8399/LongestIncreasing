package com.simplilearn.project;


	
	import java.io.*;
	import java.util.*;
	import java.lang.Math;

	public class Longestsequence {

		
		public static void main(String[] args)
	    {
	  
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("How many number you want in the lists?");
	    	int n = in.nextInt();
	    	int A[] = new int[n];
	    	System.out.println("Enter the numbers: ");
	    	for(int i=0;i<n;i++)
	    	{
	    		A[i] = in.nextInt();
	    	}
	    	
	        
	        
	        System.out.println("Length of Longest Increasing Subsequence is " + LISL(A, n));
	    }

		static int CI(int A[], int l, int r, int k)
	    {
	        while (r - l > 1) {
	            int m = l + (r - l) / 2;
	            if (A[m] >= k)
	                r = m;
	            else
	                l = m;
	        }
	 
	        return r;
	    }
	 
	    static int LISL(int A[], int size)
	    {
	        
	 
	        int[] tTablee = new int[size];
	        int length; 
	 
	        tTablee[0] = A[0];
	        length = 1;
	        for (int i = 1; i < size; i++) {
	            if (A[i] < tTablee[0])
	                
	            	tTablee[0] = A[i];
	 
	            else if (A[i] > tTablee[length - 1])
	                
	                tTablee[length++] = A[i];
	 
	            else
	                
	                tTablee[CI(tTablee, -1, length - 1, A[i])] = A[i];
	        }
	 
	        return length;
	    }
	 
	    
	    
	}



