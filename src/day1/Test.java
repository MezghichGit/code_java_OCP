package day1;

import java.util.Arrays;

public class Test {
	
	public static void info1()throws RuntimeException{
		throw new RuntimeException();
	}
	public static void info2()throws Exception{
		System.out.println();
	}
	
	public static void main(String[] args) {
		info1();
		try {
			info2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calcul op1 = (v1, v2)-> v1+v2;  // expression lambda réduite
		Calcul op2 = (double v1, double v2)->{return v1*v2;}; // expression lambda verbose
		System.out.println(op1.operation(10, 30));
		System.out.println(op2.operation(10, 30));
		
		int tab[] = {10,2,5};
		Arrays.sort(tab);

	}

}
