package pattern_1;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int nsp=0;
		int nst=n;
		int row=1;
		while(row <=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row=row+1;
			nsp+=1;
			nst-=1;
		}
	}

}
