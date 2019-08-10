package pattern_1;
import java.util.Scanner;
public class binaryTodecimal {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int multiplier=1;
		while(n!=0){
			int rem=n%10;
			ans=ans+rem*multiplier;
			multiplier=multiplier*2;
			n=n/10;
		}
		System.out.println(ans);
    }

}
