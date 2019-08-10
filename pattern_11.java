/*
	n= 5
    1
   121
  12321
 1234321
123454321

 */
package pattern_1;
import java.util.*;
public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		for(int row=1;row<=n;row++) {
			//printing spaces for n-row
			for(int space=1;space<=n-row;space++) {
				
				
				System.out.print(" ");
			}//printing number for increasing part
			int p=1;
			for(int j=1;j<=row;j++) {
				
			System.out.print(p);
			p++;
			}
			
			//printing number=decreasing part
			p=row-1;
			for(int k=1;k<=row-1;k++) {
				System.out.print(p);
				--p;
			}
			
			System.out.println();
			
		}
			
	}

}
