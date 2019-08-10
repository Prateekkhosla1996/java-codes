package pattern_1;

import java.util.Scanner;

public class starpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=1;
		for(int i=0;i<n;i++) {
			
			for(int j=n;j>=1;j--) {
				if(j==temp) {
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
			}
			temp++;
			System.out.println();
		}

	}

}
