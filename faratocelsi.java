package pattern_1;

import java.util.Scanner;

public class faratocelsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int gap=sc.nextInt();
       
        for(int i=min;i<=max;i=i+gap){
            int c=(int)((5.0/9)*(i-32));
        System.out.println(i+"\t"+c);
       
        
        }

	}

}
