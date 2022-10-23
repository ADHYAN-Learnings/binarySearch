package binarySearch;

import java.util.Scanner;

public class BinarySearchRecursive {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of elements you want to insert:");
	      int n = sc.nextInt();
	      int[] binaryValues = new int[n];
	      for(int i=0;i<n;i++) {
	    	  System.out.println("Enter the "+(i+1)+" value");
	    	  binaryValues[i] = sc.nextInt();
	      }
	      while (true) {
	      System.out.println("Enter the value you want to search");
	      int key = sc.nextInt();
	      int low = 0;
	      int high = n-1;
	      
	     int valuePosition = binarySearch(low,high,key,binaryValues);
	     if(valuePosition == -1) {
	    	 System.out.println("Value doesn't exist");
	     } else {
	    	 System.out.println(key+" found at position "+valuePosition); 
	     }
	      }
	}

	private static int binarySearch(int low, int high,int key,int[] binaryValues) {
		 
		    if(low==high) {
		    	if(binaryValues[low]==key) {
		    		return low;
		    	} else {
		    		return -1;
		    	}
		    } else {
		    	int mid = (low+high)/2;
				System.out.println(low+":::"+high+":::"+mid+":::"+binaryValues[mid]);
				if(binaryValues[mid]==key) {
					 return mid;
				} else {
					if(binaryValues[mid]>key) {
						return binarySearch(low,mid-1,key,binaryValues);
					} else {
						return binarySearch(mid + 1,high,key,binaryValues);
					}
				}
		    }
		
			
		
	
	}
	
}
