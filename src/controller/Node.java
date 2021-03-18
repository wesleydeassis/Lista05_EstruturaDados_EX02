package controller;

public class Node {
	
	public int item;
	public Node next;

	public Node(int nItem) {
		this.item = nItem;
		this.next = null;

	}


	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	public String toString() {
		return " "+item ;
	}


	



}