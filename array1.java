package array1d;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Declare
		int []arr=null;
		System.out.println(arr);
		//Allocation
		arr=new int[5];
		System.out.println(arr);//memory adress
		//get values
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//set values
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//displaying array elements using normal for loop
		System.out.println("normal loop");
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		//display array elements using enhanced for loop
		System.out.println("enhansed for loop");
		for(int val:arr) {
			
			System.out.println(val);
		}
		

	}

}
