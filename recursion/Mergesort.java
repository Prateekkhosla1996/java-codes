package recursion;

public class Mergesort {

	public static void mergesort(int input[],int si,int ei) {
		if(si>=ei) {
			return ;
		}
		int mid=(si+ei)/2;
		mergesort(input, si, mid);
		mergesort(input, mid+1, ei);
		merge(input,si,ei);
	}
	private static void merge(int[] input, int si, int ei) {
		// TODO Auto-generated method stub
		
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
			}
			else {
				ans[k]=input[j];
				j++;
				k++;
			}
			
		}
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=ei) {
			ans[k]=input[j];
			j++;
			k++;
		}
		for(int index=0;index<ans.length;index++) {
			input[si+index]=ans[index];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,8,9,1};
		mergesort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
