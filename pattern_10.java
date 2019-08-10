package pattern_1;

import java.util.Scanner;

public class pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {

            int val = 1;

            if (row != 1) {
                val = row - 1;
            }
			int cst=1;
			while(cst<=nst) {
				
				if(cst==1 ||cst==nst) {
					System.out.print(val);
					
				}
				else {
					System.out.print("0");
				}
				cst++;
			}
			row=row+1;
			nst=nst+1;
			System.out.println();

	}

}}
