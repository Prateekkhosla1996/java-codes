package array_and_string;

public class zero_one_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void zero(int arr[]) {
		int nextzero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp=arr[nextzero];
				arr[nextzero]=arr[i];
				arr[i]=temp;
				nextzero++;
			}
		}
	}

}
