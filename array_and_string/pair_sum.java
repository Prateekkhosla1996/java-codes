package array_and_string;

public class pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,3 ,6 ,2 ,5 ,4, 3 ,2 ,4};
		int sum=7;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
