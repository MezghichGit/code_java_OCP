package day1.designPattern;

import java.util.ArrayList;

public final class Animal {
	private final String espece;
	private final int age;
	private final ArrayList<String> foods;
	public Animal(int age, String espece, ArrayList<String> foods) {
		this.age = age;
		this.espece = espece;
		this.foods = new ArrayList(foods);
		//this.foods = foods;
	}
	
	@Override
	public String toString() {
		return "Animal [espece=" + espece + ", age=" + age + ", foods=" + foods + "]";
	}

	public int getAge() {
		return age;
	}
	
	public String getEspece() {
		return espece;
	}
	
	public ArrayList<String> getFoods() {
		return new ArrayList(foods);
	}
	


}
