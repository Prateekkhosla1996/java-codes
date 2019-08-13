package array_and_string;

public class removecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi i am prateek";
		char c='i';
		System.out.println(remove(str, c));
	}
	public static String remove(String str,char c) {
		String ans="";
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				ans=ans+str.charAt(i);
			}
		}
		return ans;
	}

}
