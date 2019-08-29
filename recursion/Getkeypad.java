package recursion;

public class Getkeypad {
	public static String[] numberopt(int n) {
		if(n<=1||n>10) {
			System.exit(0);
		}
		if(n==2) {
			String output[]= {"a","b","c"};
			return output;
		}
		else if(n==3) {
			String output[]= {"d","e","f"};
			return output;
		}
		else if(n==4) {
			String output[]= {"g","h","i"};
			return output;
		}
		else if(n==5) {
			String output[]= {"j","k","l"};
			return output;
		}
		else if(n==6) {
			String output[]= {"m","n","o"};
			return output;
		}
		else if(n==7) {
			String output[]= {"p","q","r","s"};
			return output;
		}
		else if(n==8) {
			String output[]= {"t","u","v"};
			return output;
		}
		else {
			String output[]= {"w","x","y","z"};
			return output;
		}
	}
	
	public static String[] retutnkeypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		int last=n%10;
		int smallnum=n/10;
		String smallans[]=retutnkeypad(smallnum);
		String option[]=numberopt(last);
		String ans[]=new String[smallans.length*option.length];
		int k=0;
		for (int i=0;i<smallans.length;i++) {
			for(int j=0;j<option.length;j++) {
				ans[k]=smallans[i]+option[j];
				k++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 234;
		String ans[]=retutnkeypad(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
