package queue;

public class QueueUsingArray {
	private int data[];
	private int size;
	private int front;
	private int rear;
	
	public QueueUsingArray() {
		data=new int[10];
		size=0;
		front=-1;
		rear=-1;
	}
	int size() {
		return size;
	}
	boolean isempty() {
		return size==0;
	}
	int front() throws StackemptyException {
		if(size==0) {
			throw new StackemptyException();
		}
		return data[front];
	}
	void enqueue(int element) throws StackfullException {
		if(size==data.length) {
			throw new StackfullException();
		}
		if(size==0) {
			front=0;
		}
		
		rear++;
		size++;
		data[rear]=element;
	}
	int dequeue() throws StackemptyException {
		if (size==0) {
			throw new StackemptyException();
		}
		int temp=data[front];
		front++;
		size--;
		return temp;
	}
	
}
