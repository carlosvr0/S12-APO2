package ui;

import java.util.Scanner;

import model.ShiftSystem;

public class Main {
	
	public static Scanner LECTOR; 
	private static ShiftSystem controller;
	
	public static void main(String[] args) {
		LECTOR = new Scanner(System.in);
		controller = new ShiftSystem();
		
		System.out.println("***************************");
	    System.out.println("*      SEGUIMIENTO 12	  *");
	    System.out.println("*                         *");
        System.out.println("*        LinkedList       *");
	    System.out.println("***************************");
	    System.out.println("");
	    
	    menu();
	}

	public static void menu() {
		System.out.println("-----------------------------");
		System.out.println("        O P T I O N S	     ");
		System.out.println("-----------------------------");
		System.out.println(" [1] Give a turn");
		System.out.println(" [2] Show current turn");
		System.out.println(" [3] Pass turn");
		System.out.println(" [4] Delete current turn");
		System.out.println(" [5] EXIT");
		int chosenOption = LECTOR.nextInt();
		
		if(chosenOption != 5) {
			
			switch (chosenOption) {
			case 1:
				if(controller.assignTurn()) {
					System.out.println("Shift created");
					controller.print();
				}
			break;
			

			}
			
			
		}
		
		System.out.println("Finished system");
		
	}

	public ShiftSystem getController() {
		return controller;
	}

	public void setController(ShiftSystem controller) {
		this.controller = controller;
	}
}
