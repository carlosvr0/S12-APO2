package model;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	private Node currentTurn;
	
	
	public CircularLinkedList() {}
	
	
	public void addTurn(int value) {
		Node newNode = new Node(value);

		if (first == null) { // Lista vacia
			first = newNode;
			last = newNode;
			
			first.setNext(first);
			first.setPrev(first);
		} else {
			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;

			first.setPrev(last);
			last.setNext(first);
		}
	}
	
	
	
	
	
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public Node getCurrentTurn() {
		return currentTurn;
	}
	public void setCurrentTurn(Node currentTurn) {
		this.currentTurn = currentTurn;
	}
	
	@Override
	public String toString() {
		String info = "";
		
		if(first == null) {
			info += "=============\n";
			info += "  No shifts  \n";
			info += "=============";
		}
		
		info += "" + first.toString();
		
		return info;
	}
	

	
	
}
