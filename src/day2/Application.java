package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		//La classe Collections
		/*
		List<Integer>numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(1);
		numbers.add(2);
		numbers.add(8);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);*/
		List<Etudiant> students = new ArrayList<>();
		students.add(new Etudiant("Sami",24,15.5));
		students.add(new Etudiant("Amine",25,16.5));
		students.add(new Etudiant("Mourad",23,15));
		System.out.println(students);
		//Collections.sort(students);
		//System.out.println(students);
		
		// 2 ime méthode : Comparator<T>
		
		Comparator<Etudiant> compAge = (Etudiant e1, Etudiant e2)->{return e1.age - e2.age;};
		Collections.sort(students,compAge);
		System.out.println(students);
		
		Comparator<Etudiant> compNom = (Etudiant e1, Etudiant e2)->{return e1.name.compareTo(e2.name);};
		
		Collections.sort(students,compNom);
		System.out.println(students);
		
		Comparator<Etudiant> compMoyenne = (Etudiant e1, Etudiant e2)->{return (int)(100*(e1.moyenne-e2.moyenne));};
		
		Collections.sort(students,compMoyenne);
		System.out.println(students);
	}

}
