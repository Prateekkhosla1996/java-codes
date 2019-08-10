package pattern_1;

import java.util.Scanner;

public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {
			
			int cst=1;
			while(cst<=nst) {
				
				if(row%2!=0 || cst==1 ||cst==nst) {
					System.out.print("1\t");
					
				}
				else {
					System.out.print("0\t");
				}
				cst++;
			}
			row=row+1;
			nst=nst+1;
			System.out.println();
		}
	}

}
