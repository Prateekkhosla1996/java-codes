package array1d;

import java.util.Scanner;

public class linear_search {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=input();
		System.out.println("enter element to search");
		int item=sc.nextInt();
		System.out.println("linear search"+linearsearch(arr, item));
	}
	
public static int [] input() {
	int n=sc.nextInt();
	int arr[]=new int[n];
	for (int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	return arr;
}
//linear search
public static int linearsearch(int arr[],int item) {
	
	for (int i=0;i<arr.length;i++) {
		if(arr[i]==item) {
			return i;
		}
		
	}
	return-1;
}
}
