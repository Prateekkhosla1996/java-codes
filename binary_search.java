//import java.util.*;
package array1d;

import java.util.Scanner;

public class binary_search {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=input();
		int item=sc.nextInt();
		System.out.println(binarysearch(arr, item));
	}
	public static int [] input() {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		} 
		
		return arr;
	}
	
	public static int binarysearch(int arr[],int item)
	{
		int lo=0;
		int hi=arr.length-1;
		
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]<item) {
				lo=mid+1;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
				
			}
			else {
				return mid;
			}
			
		}
		return -1;
	}

}
