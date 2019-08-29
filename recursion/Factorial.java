package recursion;

public class Factorial {
public static void main(String args[]) {
	int n=5;
	System.out.println(fact(n));
}//base case
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	//calling function for n-1 factorial
	int ans=fact(n-1);
	return n*ans;
}
}
