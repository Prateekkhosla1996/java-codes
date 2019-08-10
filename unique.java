package array_and_string;

import java.util.Scanner;

public class unique {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int arr[]=takeinput();
	display(arr);
	System.out.println(findunique(arr));
}
//take input
public static int[] takeinput() {
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	return arr;
}
//display
public static void display(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
//unique
public static int findunique(int []arr) {
	int unique=arr[0];
	for(int i=1;i<arr.length;i++) {
		unique=unique^arr[i];
	}
	return unique;
}
}
