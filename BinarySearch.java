package binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements you want to insert:");
      int n = sc.nextInt();
      int[] binaryValues = new int[n];
      for(int i=0;i<n;i++) {
    	  System.out.println("Enter the "+(i+1)+" value");
    	  binaryValues[i] = sc.nextInt();
      }
     
      System.out.println("Enter the value you want to search");
      int key = sc.nextInt();
      int low = 0;
      int high = n-1;
      int mid = (low + high)/2;
      boolean valueFound = false;
      while(low<=high) {
      System.out.println(low+"::::"+high);
    	 if(binaryValues[mid]==key) {
    		 valueFound = true;
    		 System.out.println(key+" found at position "+mid);
    		 break;
    	 } else {
    		 if(binaryValues[mid]>key) {
    			 high = mid -1;
    			 mid = (low + high)/2;
    		 } else {
    			 low = mid + 1;
    			 mid = (low + high)/2;
    		 }
    	 }
    	 
      }
      if(!valueFound) {
    	  System.out.println("Value doesn't exist");
      }
	}
}
