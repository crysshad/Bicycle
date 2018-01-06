package Cat;

import java.util.ArrayList;

public class kittyStatusCheck extends Cat implements OutputAndLogic {

	String name = "";
	String catType = "";
	String furPattern = "none";
	double caloriesPerDay;
	double weight;
	boolean doesCatPur;

	public kittyStatusCheck(int numOfLeg, boolean mammal, String sound, String name, double caloriesPerDay,
			double weight, boolean doesCatPur) {
		super(numOfLeg, mammal, sound);
		this.name = name;
		this.caloriesPerDay = caloriesPerDay;
		this.weight = weight;
		this.doesCatPur = doesCatPur;
	}

	@Override
	public String catType() {
		if (isCat() == true && furPattern.equals("strip")) {

			catType = "Tabby";

		}

		else {
			catType = "American Short Hair";
		}

		return catType;

	}

	@Override
	public boolean goodFoodConsumption() {

		if (weight <= 8 && 240 <= caloriesPerDay && caloriesPerDay <= 250) {

			return true;

		}

		else {
			return false;
		}

	}

	@Override
	public boolean isHealthy() {

		if (goodFoodConsumption() == true) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean pur() {
		if (doesCatPur == true) {
			return true;
		}

		else {
			return false;
		}

	}



	@Override
	public void kittyHappyinessOutput() {

		ArrayList<String> outputArray = new ArrayList<String>();

		outputArray.add(name + " is a " + catType());

		if (isHealthy() == true && pur() == true) {
			outputArray.add(name + " is a healty and happy kitty");
		} else if (isHealthy() == true) {
			outputArray.add(name + " is a healty kitty");
		}
		else {
			outputArray.add("please take care of " + name);
		}

		
		for (int i = 0; i < outputArray.size(); i++) {

			System.out.println(outputArray.get(i));

		}

	}

}
