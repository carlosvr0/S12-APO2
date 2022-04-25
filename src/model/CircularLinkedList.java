package model;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	private Node currentTurn;
	
	public CircularLinkedList() {}
	
	
	public void addTurn(int value) {
		Node newNode = new Node(value);

		if (isEmpty()) { // Lista vacia
			first = newNode;
			currentTurn = first;
			last = newNode;
			
			first.setNext(first);
			first.setPrev(first);
			
		} else {
			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;
			
			last.setNext(first);
			first.setPrev(last);		
		}
	}
	
	
	public boolean isEmpty() {
		if(first == null) {
			return true;
		} 
		
		return false;
	}
	
	
	public boolean deleteCurrentShift() {
		boolean deleted = false;

		if(isEmpty()) {
			return false;
		}
		
		Node temp = first;
		
		do {
			if (temp.getValue() == currentTurn.getValue()) {
				
				if (temp == first && temp == last) {
					first = null;
					last = null;
					currentTurn = null;
				} else if (temp == first) {
					
					first = first.getNext();
					first.setPrev(last);
					last.setNext(first);
					
					currentTurn = currentTurn.getNext();
					
				} else if (temp == last) {
					
					last = last.getPrev();
					last.setNext(first);
					first.setPrev(last);
					
					currentTurn = first;
					
				} else {
					
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
					
					currentTurn = temp.getNext();
				}
				
				deleted = true;
			} else {
				temp = temp.getNext();
			}

		} while (temp != first && !deleted);
		
		return deleted;
	}
	
	
	public String passShift() {
		String info = "";
		
		Node temp = currentTurn;
		
		if(temp.getCalls() == 3) {
			
			info = "Current turn (" + currentTurn.getValue() + ") removed";
			deleteCurrentShift();
			
		}else {
			temp.setCalls();
			
			if(temp.getCalls() == 2) {
				info = "Current turn (" + temp.getValue() + ") has been called twice";
			} else {
				info = "Current turn (" + temp.getValue() + ") has been called " + temp.getCalls() + " times";
			}
			
			
			currentTurn = currentTurn.getNext();
		}
		
		return info;
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
		
		if(isEmpty()) {
			info = "=============\n";
			info += "  No shifts  \n";
			info += "=============";
			
		} else {
			
			Node temp = first;
			
			while (temp.getNext() != first) {
				info += " [" + temp.getValue() + "]";
				temp = temp.getNext();
			}
			
			info += " [" + temp.getValue() + "]";

		}

		return info;
	}
	

	
	
}
