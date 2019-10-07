package stack;

public class stackusingll<t> {
	private node<t> head;
	private int size;
	public stackusingll(){
		head=null;
		size=0;
	}
	
	int size() {
		return size;
	}
	
	boolean isempty() {
		return size()==0;
	}
	t top() throws Exception{
		if (size()==0) {
			stackempty e=new stackempty();
			throw e;
		}
		return head.data;
	}
	void push(t element) {
		node<t> nn=new node<t>(element);
		nn.next=head;
		head=nn;
		size++;
	}
	t pop() throws Exception {
		if (size()==0) {
			stackempty e=new stackempty();
			throw e;
		}
		t temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
}
