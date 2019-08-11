package array_and_string;

import java.util.Scanner;

public class substring {
public static void main(String[]args ) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	sc.close();
	for(int i=0;i<=str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			System.out.println(str.substring(i,j));
		}
	}
}
}
