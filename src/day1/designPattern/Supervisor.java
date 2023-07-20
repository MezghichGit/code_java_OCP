package day1.designPattern;


// Un singleton
public class Supervisor {
	
	private static Supervisor instance=null;
	
	private Supervisor()
	{}
	public synchronized static Supervisor getInstance()  //thread safe
	{
		if(instance==null)
		{
			instance = new Supervisor();
			System.out.println("Created");
			for(int i =0;i<10;i++)
			{
				System.out.println(i);
			}
		}
		
		return instance;
	}

}
