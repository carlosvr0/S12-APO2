package model;

public class ShiftSystem {
	public static int SHIFT_NUM = 0;
	public static int SHIFT_LIMIT_NUM = 50;
	
	private CircularLinkedList list;
	
	public ShiftSystem() {
		setList(new CircularLinkedList());
	}

	
	public boolean assignTurn() {
		SHIFT_NUM++;
		
		if(SHIFT_NUM < SHIFT_LIMIT_NUM) {
			list.addTurn(SHIFT_NUM);
			return true;
		}
		
		return false;
	}
	
	
	public String print() {
		String info = list.toString();
		return info;
	}
	
	public CircularLinkedList getList() {
		return list;
	}
	public void setList(CircularLinkedList list) {
		this.list = list;
	}
	
	
	
}
