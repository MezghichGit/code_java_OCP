package day2.bound;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		A a = new B();
		
		//List<Object> lo = new ArrayList<String>();  //KO
		//ArrayList<A> la = new ArrayList<B>();  //KO
		
		//Unbounded
		
		ArrayList<?> la = new ArrayList<B>();
		
		// UpperBound
		
		ArrayList<? extends A> lup = new ArrayList<A>();
		
		//Lower-Bound
		
		ArrayList<? super B> lob = new ArrayList<A>();

	}

}
