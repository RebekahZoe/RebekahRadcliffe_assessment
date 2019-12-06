package main;

public class WrongInputException extends Exception {

	@Override
	public String toString() {
		return "Wrong input, please enter either north, east, south or west. Please try the program again";
	}
	
	
}
