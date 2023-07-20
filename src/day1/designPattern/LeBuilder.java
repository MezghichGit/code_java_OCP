package day1.designPattern;

import java.util.Locale;

public class LeBuilder {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale.setDefault(locale);
		Locale locale2 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale locale3 = new Locale.Builder().setRegion("US").setLanguage("en").build();
		System.out.println(locale2);
		
		Locale.setDefault(locale2);
		System.out.println(Locale.getDefault());

	}

}
