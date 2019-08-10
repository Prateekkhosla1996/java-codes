package pattern_1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	       sc.close();
	        boolean isprime=true;
	        for(int i=2;i<=n/2;i++){
	            if(n%i==0) {
	            	isprime=false;
	            
	            }
	        }
	            if(isprime==true){
	                System.out.println("Prime");
	            }
	            else{
	                System.out.println("Not Prime");
	            }
	        
	}

}
