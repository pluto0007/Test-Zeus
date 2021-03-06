package org.com.exam.module1;

public class QueueImplementationUsingArray {

	static int[] arr = new int[10];
	static int front =-1;
	static int rear = -1;
	
	public boolean isEmpty() {
		if(front ==-1 && rear ==-1) {
			return true;
		}
		else return false;
		
	}
	
	public void enQueue(int data) {
		if(rear==arr.length) {
			System.err.println("Array is full");
			return;
		}
		
		if(isEmpty()) {
			rear=0;
			front=0;
		}else {
			rear=rear+1;
		}
		arr[rear]=data;
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.err.println("Array is empty");
			return;
		}
		else if(rear==front) {
			rear = front = -1;
		}
		else {
			front = front+1;
		}
	}
	public static void printArray() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		QueueImplementationUsingArray array = new QueueImplementationUsingArray();
		array.enQueue(10);
		array.enQueue(20);
		array.enQueue(30);
		array.enQueue(40);
		printArray();
		array.deQueue();
		System.out.println("\nArray after dequeue");
		printArray();
		array.enQueue(50);
		System.out.println("\nArray after equeue");
		printArray();
	}

}
