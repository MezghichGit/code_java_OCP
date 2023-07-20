package day1.designPattern;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class ShapeFactory {

	public static Shape getShapeFactory(int ... args)
	{
		int size = args.length;
		switch(size) {
		
		case 1: return new Cercle();
		case 3: return new Triangle(); 
		case 4: return new Rectangle(); 
		default :  throw new IllegalArgumentException("Forme inconnue");
		}
		
	}
	public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.of(2014, 10, 3);
		LocalDate ld2 = LocalDate.of(2014, Month.APRIL, 3);
		//Shape s1 = getShapeFactory(10,4,6,6);
		Shape s1 = getShapeFactory(10);
		System.out.println(s1);
		//System.out.println(s1.toString());
		/*
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		Locale locale2 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(locale2);*/
	}

}
