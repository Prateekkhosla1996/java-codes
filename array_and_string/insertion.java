package array_and_string;

import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
	int a[]= {12,2,3,5,7};
	int b[]= {2,4,6,5,8,7};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				b[j]=-1;
				break;
			}
		}
	}
	}

}
