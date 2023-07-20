package day2.interfacesFonctionnelles;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExoFunctionalInterface {

	public static void main(String[] args) {
		// 1)Supplier<T>
		
		Supplier<Integer> sup = ()->10;
		System.out.println(sup.get());
		
		Supplier<Double> sd = ()->Math.random(); //  implementation via lambda
		
		Supplier<Double> sdr = Math::random; // implementation via méthode de référence par méthode static
		
		System.out.println(sd.get());
		System.out.println(sdr.get());
		
		//2)Consumer<T>
		
		Consumer<String> con = (String ch)->System.out.println(ch);
		Consumer<String> conr = System.out::println; // implementation via méthode de référence par une méthode d'instance sur une instance connue
		
		//3)Predicate<T>
		Predicate<String>filter = s->s.isEmpty();
		Predicate<String>filterr = String::isEmpty;// implementation via méthode de référence par une méthode d'instance(isEmpty) sur une instance inconnue
		System.out.println(filterr.test("ocp"));
		
		//4)Supplier<T>
		
		Supplier<StringBuilder> f = ()->new StringBuilder();
		Supplier<StringBuilder> fr =  StringBuilder::new; // implementation via méthode de référence par constructeur
		
		System.out.println(fr.get().getClass());
		
		//5)Function<T,R>
		Function<String,Integer> map = (String ch)->{return ch.length();};
		System.out.println(map.apply("ocp"));

		Function<String,Integer> mapr = String::length;
		System.out.println(mapr.apply("ocp"));
		
		//6)Predicate
		String phrase = "Une formation OCP par Sagmen aux locaux de Regus";
		Predicate<String> pred = s -> s.contains("ocp");
		
		Predicate<String> predr = phrase::contains;
		System.out.println(predr.test("OCP"));
		
		// exemple avec removeIf, forEach
		ArrayList<String>names = new ArrayList<>();
		names.add("amine");
		names.add("salah");
		names.add("mourad");
		names.add("mounir");
		
		/*for(String name:names)
		{
			if(name.contains("i"))
			{
				names.remove(name);
			}
		}*/
		names.removeIf(x->x.contains("i"));
		names.forEach(System.out::println);
		/*for(int i=0; i<names.size(); i++)
		{
			if(names.get(i).contains("i"))
			{
				names.remove(names.get(i));
			}
		}*/
		
		System.out.println(names);
	}

}
