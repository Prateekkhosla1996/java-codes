package pattern_1;
/*
 	5
    *
   **
  ***
 ****
*****

*/
import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int nst=1;
		int nsp=n-1;
		int row =1;
		while(row<=n) {
			//work for spaces
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp++;
				
			}//work for stars
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
	
				
			}
			//preperation
			System.out.println();
			nsp=nsp-1;
			nst=nst+1;
			row=row+1;
			
		}

	}

}
