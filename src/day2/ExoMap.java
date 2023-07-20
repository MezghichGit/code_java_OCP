package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExoMap {

	public static void main(String[] args) {
		//Map<String,Integer>annuaire = new HashMap<>();
		Map<String,Integer>annuaire = new TreeMap<>();
		annuaire.put("Amine", 20200300);
		annuaire.put("Aaine", 20200300);
		annuaire.put("aaine", 20200300);
		annuaire.put("Amine", 20200400);
		annuaire.put("Sami", 20200300);
		annuaire.put("Omar", 20200300);
		System.out.println(annuaire);

	}

}
