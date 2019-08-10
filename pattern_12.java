package pattern_1;

import java.util.Scanner;

public class pattern_12 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//rows
		for(int i=1;i<=n;i++) {
			
			//spaces
			for(int spaces=1;spaces<=n-i;spaces++) {
				
				System.out.print(" ");
			}
			//increasing
			int p=i;
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			//decreasing
			p=2*i-2;
			for(int k=1;k<=i-1;k++) {
				System.out.print(p);
			--p;
			}
			System.out.println();
		}
	}
}
