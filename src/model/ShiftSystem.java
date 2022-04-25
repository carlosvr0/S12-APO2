package model;

public class ShiftSystem {
	public static int SHIFT_NUM;
	public static int SHIFT_LIMIT_NUM;
	
	private CircularLinkedList list;
	
	public ShiftSystem() {
		SHIFT_NUM = 0;
		SHIFT_LIMIT_NUM = 51;
		list = new CircularLinkedList();
	}

	
	public boolean assignTurn() {
		SHIFT_NUM++;
		
		if(SHIFT_NUM < SHIFT_LIMIT_NUM) {
			list.addTurn(SHIFT_NUM);
			return true;
		}
		
		return false;
	}
	
	
	public String printList() {
		String info = list.toString();
		return info;
	}
	
	
	public String printCurrentShift() {
		String info = "" + list.getCurrentTurn().getValue();	
		return info;
	}

	public boolean deleteTurn() {
		if(list.deleteCurrentShift()) {
			return true;
		}
		 return false;
	}
	
	public String passCurrentShift() {
		String info = "" + list.passShift();
		return info;
	}
	
	
	
	public CircularLinkedList getList() {
		return list;
	}
	public void setList(CircularLinkedList list) {
		this.list = list;
	}
	
	
	
}
