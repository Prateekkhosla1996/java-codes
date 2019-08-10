package pattern_1;

import java.util.Scanner;

public class zeroandstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=1,t2=n;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==t1) {
					System.out.print("*");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.print("*");
			for(int j=1;j<=n;j++) {
				if(j==t2) {
					System.out.print("*");
				}
				else {
					System.out.print("0");
				}
			}
			t1++;
			t2--;
			System.out.println();
		}

	}

}
