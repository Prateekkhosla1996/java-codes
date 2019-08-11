package array_and_string;

import java.util.Scanner;

public class reverse_string_word_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverse(str));
		sc.close();
	}
	
	public static String reverse(String str) {
		int i=str.length()-1;
		int end=str.length();
		String result="";
		while(i>=0) {
			if(str.charAt(i)==' ') 
			{
			result=result + str.substring(i+1, end)+" ";
			}
			i--;
		}
		result=result.substring(0,end);
		return result;
	}

}
