package pattern_1;

import java.util.Scanner;

public class patern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row =1;
		while(row<=n) {
			
			
		int	col=1;
		while(col<=n) {
		System.out.print("*");
		col=col+1;
		}
		System.out.println();
		row=row+1;
		}
		}
	}


