package day2;

import java.util.*;

public class UseContainer {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aymen","rim","amen","salah");
		
		
		names.stream().filter(x->x.contains("a")).forEach(System.out::println);
		
		/*
		Container<String>cs = new Container<>("ocp");
		cs.display();
		
		Container<StringBuilder>cb = new Container<>(new StringBuilder("OCP"));
		cb.display();
		
		Container<Etudiant>ce = new Container<>(new Etudiant("Amine",24,15.5));
		ce.display();*/
		

	}

}
