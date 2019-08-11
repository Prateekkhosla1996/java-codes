package array_and_string;

import java.util.Scanner;

class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		String str=sc.nextLine();
		System.out.println("no of count is"+count(str));
		sc.close();
	}
	public static int count(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
			
		}
		count++;
		return count;
	}

}
