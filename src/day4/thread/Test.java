package day4.thread;

public class Test {

	public static void main(String[] args) {
		/*
		System.out.println(Thread.currentThread().getName());
		new Thread(new Worker()).start();
		new Thread(new Master()).start();
		System.out.println("Begin");
		for(int k = 0;k<10;k++)
		{
			System.out.println("k = "+k );
		}
		
		System.out.println("End");
		
		new Work().start();*/
		Runnable task = ()->{
			System.out.println("Hello Thread");
		};
		
		new Thread(task).start();
		new Thread(task).start();
		

	}

}
