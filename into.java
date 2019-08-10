package pattern_1;

import java.util.Scanner;

public class into {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0)
		{
		int rem=n%10;
		
		n=n/10;
		count=count+(rem*rem*rem);
		
		}
		System.out.println(count);
		if(temp==count) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		}


}
