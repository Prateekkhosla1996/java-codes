package array_and_string;

import java.util.Arrays;
import java.util.Scanner;

public class Ispermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(ispermutation(str1, str2));
	}
	public static boolean ispermutation(String str1,String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1 != n2) {
			return false;
		}
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<n1;i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}

}
