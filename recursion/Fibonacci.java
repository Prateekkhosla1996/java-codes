package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		//base case
		if(n==1||n==0) {
			return n;
		}
		int f1=fib(n-1);
		int f2=fib(n-2);
		int fb=f1+f2;
		return fb;
		
	}

}
