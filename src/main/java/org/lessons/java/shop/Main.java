package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		  Prodotto prodotto1 = new Prodotto("oggetto", "bel prodotto", 30.55, 20);
		
		  //stampa del prezzo del prodotto
		  System.out.println(prodotto1.getPrice());
		
		  //stampa del prezzo del prodotto comprensivo di IVA
		  System.out.println(prodotto1.getFullPrice());
		
		  //stampa del nome completo del prodotto in formato codice-nome
		  System.out.println(prodotto1.getFullName());
		  
	}

}
