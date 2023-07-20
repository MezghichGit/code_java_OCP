package day4.thread;

public class Work extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int jj=0; jj<10;jj++)
		{
			System.out.println("jj = "+jj);
		}
		
	}
}
