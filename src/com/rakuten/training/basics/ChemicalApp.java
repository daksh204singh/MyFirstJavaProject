package com.rakuten.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		System.out.println("Is hydrogen an alkali? "+h.isAlkaliMetal());
	
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		System.out.println("Is Potassium an alkali? "+k.isAlkaliMetal());
	
//		h+k;
		String s = "Hello "+h;// ==> "Hello "+h.toString() ==> "Hello ".concat(h.toString())
		System.out.println(s);
//		System.out.println(h);
	}

}
