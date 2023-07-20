package day2;

public class Etudiant implements Comparable<Etudiant>{
//public class Etudiant {
	String name;
	int age;
	double moyenne;
	@Override
	public String toString() {
		return "Etudiant [name=" + name + ", age=" + age + ", moyenne=" + moyenne + "]";
	}
	public Etudiant(String name, int age, double moyenne) {
		super();
		this.name = name;
		this.age = age;
		this.moyenne = moyenne;
	}
	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		//return this.age-o.age;
		//return this.name.compareTo(o.name);
		return (int)(100*(this.moyenne-o.moyenne));
	}

}
