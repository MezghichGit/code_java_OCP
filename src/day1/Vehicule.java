package day1;

@FunctionalInterface
public interface Vehicule {
	
	public void info();
	
	// v8
	
	default public void affichage() {
		System.out.println("Hello");
	}
	
	static public void affichage2() {}
	
	// v9
	
	private void affichage3() {
		System.out.println("Hello");
	}
	
	private static void affichage4() {
		System.out.println("Hello");
	}

}
