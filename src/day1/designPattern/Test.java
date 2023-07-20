package day1.designPattern;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
	/*	ExecutorService service = Executors.newFixedThreadPool(2);

		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Supervisor.getInstance());
		
		};

		service.execute(task);
		service.execute(task);*/
		// Supervisor s1 = Supervisor.getInstance();
		// Supervisor s2 = Supervisor.getInstance();
		// System.out.println(s1.hashCode());
		// System.out.println(s2.hashCode());
		
		ArrayList<String>repas = new ArrayList<>();
		repas.add("Fish");
		repas.add("Meat");
		Animal a = new Animal(2,"Chien",repas);
		System.out.println(a);
		//repas = a.getFoods();
		repas.clear();
		System.out.println(a);

	}

}
