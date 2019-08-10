package pattern_1;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int row=1;
		int nst=1;
		int n=sc.nextInt();
		while(row<=n) {
			int col=1;
			while(col<=nst) {
				
				System.out.print("*");
				col++;
			}
			
			//prepration
			System.out.println();
			nst=nst+1;
			row=row+1;
			
		}
	}

}
