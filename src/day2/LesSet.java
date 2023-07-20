package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LesSet {

	public static void main(String[] args) {
		//Set<Integer>numbers = new HashSet<>();
		/*Set<Integer>numbers = new TreeSet<>();
		System.out.println(numbers.add(12));
		System.out.println(numbers.add(11));
		System.out.println(numbers.add(20));
		System.out.println(numbers.add(14));
		
		System.out.println(numbers);*/
		/*
		Set<Etudiant> students = new TreeSet<>();
		students.add(new Etudiant("Sami",24,15.5));
		students.add(new Etudiant("Amine",25,16.5));
		students.add(new Etudiant("Mourad",23,15.5));
		System.out.println(students);*/
		
		List<Integer> numbers = new ArrayList<>();
		System.out.println(numbers.add(12));
		System.out.println(numbers.add(11));
		System.out.println(numbers.add(20));
		System.out.println(numbers.add(14));
		//Collections.sort(numbers);
		System.out.println(numbers);
		
		System.out.println(Collections.binarySearch(numbers,14));
		

	}

}
