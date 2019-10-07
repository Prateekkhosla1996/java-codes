package stack;

public class stackuse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stackusingll<Integer> s1=new stackusingll<Integer>();
		for(int i=1;i<=5;i++) {
			s1.push(i);
		}
		while(!s1.isempty()) {
			try {
				System.out.println(s1.pop());
			}
			catch(stackempty e) {
				
			}
		}
	}

}
