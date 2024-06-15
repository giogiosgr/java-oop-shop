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
		  
		  //uso dei vai getters e setters
		  System.out.println(prodotto1.getName());
		  
		  prodotto1.setName("oggettone");
		  
		  System.out.println(prodotto1.getName());
		  
          prodotto1.setDescription("bellissimo prodotto");
		  
		  System.out.println(prodotto1.getDescription());
		  
          prodotto1.setPrice(100.01);
		  
		  System.out.println(prodotto1.getPrice());
		  
		  System.out.println(prodotto1.getCode());
		  
		  //stampa del codice paddato a sinistra con zeri
		  System.out.println("Il codice prodotto è: " + Prodotto.getPaddedCode(prodotto1.getCode()));	  
	}

}
