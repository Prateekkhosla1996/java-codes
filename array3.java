package array1d;

import java.util.Scanner;

public class array3 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring a array type of variable for input	
		int arr[]=input();
			display(arr);
			System.out.println("maximum value in array is:"+max(arr));
	}
	
	//take input
	public static int [] input() {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i =0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	//display input
	public static void display(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	//max function
	
	public static int max(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
