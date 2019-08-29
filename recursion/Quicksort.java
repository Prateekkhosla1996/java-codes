package recursion;

public class Quicksort {

	public static void quicksort(int input[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int p=partition(input,si,ei);
		quicksort(input,si,p-1);
		quicksort(input, p+1, ei);
	}
	private static int partition(int[] input, int si, int ei) {
		// TODO Auto-generated method stub
		int pivot=input[ei];
		int i=si-1;
		for(int j=si;j<ei;j++) {
			if(input[j]<=pivot) {
				i++;
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
		int temp = input[i+1]; 
        input[i+1] = input[ei]; 
        input[ei] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {5,4,11,55,7,8,2};
		quicksort(input, 0, input.length-1);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

}
