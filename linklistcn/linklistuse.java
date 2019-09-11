package linklistcn;

import java.util.Scanner;

public class linklistuse {
	//insert the link list
	public static  Node<Integer> takeinput(){
		Node<Integer> head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> nn=new Node<Integer>(data);
			if(head==null) {
				head=nn;
				tail=nn;
			}
			else {
				tail.next=nn;
				tail=nn;
			}
			data=sc.nextInt();
		}
		return head;
	}
	//print the link list	
	public static void print(Node<Integer>head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node<Integer> insert(Node<Integer> head,int data,int pos){
		Node<Integer> nn=new Node<Integer>(data);
		int i=0;
		Node <Integer> temp=head;
		if(pos==0) {
			nn.next=head;
			return nn;
		}
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		nn.next=temp.next;
		temp.next=nn;
		return head;
	}
	
	public static Node<Integer> deleteIthNode(Node<Integer> head, int i){
		if(head==null) {
			return head;
			
		}
		int count=0;
		Node<Integer>temp=head;
		while(temp!=null&&count<i-1) {
			temp=temp.next;
			count++;
		}
		if(temp==null) {
			return head;
		}
		if(temp!=null) {
			temp.next=temp.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node<Integer> nn=new Node<Integer>(10);
		//System.out.println(nn.data);
		//System.out.println(nn.next);
		//Node<Integer> nn2=new Node<Integer>(20);
		//nn.next=nn2;
		//System.out.println(nn2);
		//System.out.println(nn.next);
		Node <Integer>nn=takeinput();
		nn=insert(nn, 80, 0);
		print(nn);
		System.out.println("......................................");
		Node <Integer>del=deleteIthNode(nn, 0);
		print(del);
	}

}
