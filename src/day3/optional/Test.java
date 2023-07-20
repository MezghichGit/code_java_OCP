package day3.optional;

import java.util.Optional;

public class Test {

	public static Optional<Double> average(int ... scores) {
		if (scores.length == 0) return Optional.empty(); 
		int sum = 0;
		for (int score: scores) sum += score;
		return Optional.of((double) sum / scores.length);
		}

	public static void main(String[] args) {
		System.out.println(average());
		System.out.println(average(10,15,15));
		
		Optional<Double> res1 = average();
		Optional<Double> res2 = average(10,15,15);
		/*if(res2.isPresent())
			System.out.println("Existe "+ res2.get());
		else System.out.println("Pas de valeur");*/
		
		//res2.ifPresent(System.out::println);
		System.out.println(res2.orElse(Math.random()));
		//System.out.println(res1.orElseGet(()->new Double(10)));
		System.out.println(res1.orElseThrow(()->new IllegalArgumentException("Valeur introuvale")));
		//System.out.println(res1.get());

	}

}
