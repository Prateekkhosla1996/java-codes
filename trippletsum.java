package array_and_string;

import java.util.Arrays;

public class trippletsum {
public static void main(String[] args) {
	int arr[]= {1 ,2 ,3 ,4 ,5 ,6 ,7 };
	int sum=12;
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;i++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[i]+arr[j]+arr[k]==sum) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}
}
}
