package day2;

import java.util.ArrayDeque;

public class ExempleQueue {

	public static void main(String[] args) {
		// exemple File
		ArrayDeque<Integer> file = new ArrayDeque<>();
		System.out.println(file.poll());
		/*file.offer(12);
		file.offer(4);
		file.offer(3);
		file.offer(10);
		System.out.println(file);
		System.out.println(file.peek());
		System.out.println(file.poll());
		System.out.println(file);
		System.out.println(file.peek());*/
		
		// exemple Pile
		
		ArrayDeque<Integer> pile = new ArrayDeque<>();
		pile.pop();
		//pile.add(10);
		//pile.add(1);
		//System.out.println(pile);
		/*
		pile.push(12);
		pile.offer(16);
		pile.push(4);
		pile.push(3);
		pile.offer(15);
		pile.push(10);
		System.out.println(pile);
		
		System.out.println(pile.peek());
		System.out.println(pile.pop());
		System.out.println(pile);
		System.out.println(pile.peek());*/
		

	}

}
