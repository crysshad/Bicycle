package Cat;

public class Cat {

	// Declare variables
	private int numOfLeg;
	private boolean mammal;
	private String sound;


	// Create a constructor
	public Cat(int numOfLeg, boolean mammal, String sound) {
		this.numOfLeg = numOfLeg;
		this.mammal = mammal;
		this.sound = sound;

	}

	// Check if the animal is a cat
	public boolean isCat() {
		boolean isCat = false;

		if (numOfLeg == 4 && mammal == true && sound.equals("meow")) {

			isCat = true;
			
		} else {
			
			isCat = false;
		}

		return isCat;
	}

	
	
	

}
