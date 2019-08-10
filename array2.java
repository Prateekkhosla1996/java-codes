package array1d;

import java.util.Scanner;

public class array2 {
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeinput();
		display(arr);
		}
	
	public static int[] takeinput(){
		//array size
		int n=sc.nextInt();
		//array declare
		int[] arr=new int[n];
		for(int i =0;i <= arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	
	public static void display(int [] arr)
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
