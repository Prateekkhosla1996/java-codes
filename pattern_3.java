package pattern_1;
//5
//*****
//****
//***
//**
//*

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		int row=1;
		while(row<=n) {
			
			int col=1;
			while(col<=nst) {
			System.out.print("*");
			col++;
				
			}
			System.out.println();
			nst=nst-1;
			row=row+1;
			
		}
		
		
		
	}

}
