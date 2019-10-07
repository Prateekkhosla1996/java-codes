package stack;

public class BalancedParenthesis {

	public static boolean balance(String s2) throws Exception {
		stackusingll<Character> s=new stackusingll<Character>();
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)=='('|| s2.charAt(i)=='{'||s2.charAt(i)=='[') {
				s.push(s2.charAt(i));
			}
			else if(s2.charAt(i)==')'|| s2.charAt(i)=='}'||s2.charAt(i)==']'){
				if(s.isempty()) {
					return false;
				}
				char ch=s.pop();
				if(s2.charAt(i)==')'&&ch=='(') {
					continue;
				}
				else if(s2.charAt(i)=='}'&&ch=='{') {
					continue;
				}
				else if(s2.charAt(i)==']'&&ch=='[') {
					continue;
				}
				else {
					return false;
					}
				}
			}
		if(s.isempty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s="(a(+b)";
		System.out.println(balance(s));
	}

}
