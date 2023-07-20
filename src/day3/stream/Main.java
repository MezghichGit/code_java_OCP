package day3.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//Exemple 1
		/*
		Stream<String> names = Stream.of("jaziri","aymen","hamdi","samia","yasmine","maryem");
		long v = names
		.map(s->s.toUpperCase())
		//
		.filter(x->!x.contains("Y"))
		.peek(System.out::println)
		//.forEach(System.out::println);
		.count();
		System.out.println(v);*/
		
		//Exemple 2
		//List<String> noms = Arrays.asList("jaziri","aymen","hamdi","samia","yasmine","maryem");
		//Stream<String> names = noms.stream();
		//Stream<String> names = noms.parallelStream();
		/*
		List<String> result = names
		.map(s->s.toUpperCase())
		.filter(x->!x.contains("Y"))
		.peek(System.out::println)
		.collect(Collectors.toList());
		
		System.out.println(result);
		
		names.forEach(System.out::println);*/
		/*names.findAny().ifPresent(System.out::println);
		
		Stream<Double> numbers = Stream.generate(Math::random);
		numbers.limit(10).forEach(System.out::println);*/
		
		
		List<String> noms = Arrays.asList("jazi","ayme","hamdi","samia","yasm","mary");
		Stream<String> names = noms.stream();
		
		
		//Stream<String> vals = Stream.of("abc","def","ghi");
		///String res = vals.reduce(";", (u,v)->u+v);
		Optional<String> res = names.filter(x->x.length()==4).sorted().limit(2).reduce( (u,v)->u+v);
		System.out.println(res.get());
		//Optional<String> res = vals.reduce((u,v)->u+v);
		//System.out.println(res) ;
		Stream<String> infinite = Stream.generate(() -> "chimp");
		System.out.println(infinite.allMatch(x->x.length()==5)); 
	}

}
