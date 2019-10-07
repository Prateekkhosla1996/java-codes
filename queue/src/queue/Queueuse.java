package queue;

public class Queueuse {

	public static void main(String[] args) throws StackfullException {
		// TODO Auto-generated method stub
			
		QueueUsingArray queue=new QueueUsingArray();
		for(int i=1;i<=5;i++) {
			queue.enqueue(i);
		}
		while(!queue.isempty()) {
			try {
				System.out.println(queue.dequeue());
			}
			catch(StackemptyException e){
				
			}
		}
	}

}
