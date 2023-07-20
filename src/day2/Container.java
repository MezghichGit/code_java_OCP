package day2;

public class Container<T> {
	
	T t;
	
	public void display()
	{
		System.out.println(this.t.toString());
	}
	
	public Container(T t)
	{
		this.t = t;
	}

}
