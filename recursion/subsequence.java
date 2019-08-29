package recursion;

public class subsequence {

	public static String[] subsequence(String str) 
	{
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String small[]=subsequence(str.substring(1));
		String ans[]=new String[2*small.length];
		int k=0;
		for(int i=0;i<small.length;i++) {
			ans[k]=small[i];
			k++;
		}
		for(int i=0;i<small.length;i++) {
			ans[k]=str.charAt(0)+small[i];
			k++;
		}
		return ans;
	}
	public static void main(String args[]) {
		String str="xyz";
		String ans[]=subsequence(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}
