package tascas104level1ex2;

import java.lang.reflect.Array;

public class IdCalculation {
	int id;
	
	public IdCalculation(String id) {
		 if (!id.matches("\\d{8}")) {
			 throw new IllegalArgumentException("The ID must have exactly 8 digits");
		 }
		this.id = Integer.parseInt(id);
		idLetter();
	}
	
	public int getId() {
		return this.id;
	}

	public String idLetter() {
		String[] letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		int calc = -1;
		String letter = "";
		
		calc = this.id % 23;
		letter =  letters[calc];
		
		System.out.println("Your ID is " + this.getId() + letter );
		
		return letter;
	}
	
	public void createId(String id) {
		IdCalculation id1 = new IdCalculation(id);
	}
}


