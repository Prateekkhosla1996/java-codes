package pattern_1;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=(n/2+1);
		int nsp=-1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*\t");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" \t");
				csp++;
			}
			cst=1;
			if(row==1 || row==n) {cst=2;}
			while(cst<=nst) {
				
				System.out.print("*\t");
				cst++;
			}
			if(row<=n/2)
			{
				nsp+=2;
				nst--;
			}
			else {
				nsp-=2;
				nst++;
				
			}
			row++;
			System.out.println("\t");
		}
	}

}
