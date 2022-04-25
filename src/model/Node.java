package model;

public class Node {
	
	private int value;
	private Node next;
	private Node prev;
	
	public Node(int value) {
		this.value = value;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
		String info = "[" + value + "]";

		if (next != null) {
			info += " [" + next.getValue() + "]";
		}

		return info;
	}
	
}
