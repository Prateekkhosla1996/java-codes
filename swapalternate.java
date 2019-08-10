package array_and_string;

import java.util.Scanner;

public class swapalternate {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		display(arr);
	
	
	}
	
	public static int[] takeinput() {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void swapalternate(int[] arr) {
		for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}

}
