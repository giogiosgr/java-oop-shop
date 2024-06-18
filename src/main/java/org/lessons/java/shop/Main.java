package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto1 = new Prodotto("oggetto", "bel prodotto", 30.55, 20);
		
		//utilizzo dei vari getters e setters dell'oggetto di classe Prodotto
        System.out.println("Nome esteso del prodotto: " + prodotto1.getFullName());
		
		System.out.println("Prezzo intero del prodotto: " + prodotto1.getFullPrice());

		prodotto1.setName("oggettone");
		  
		System.out.println("Nuovo nome del prodotto: " + prodotto1.getName());

		System.out.println("Descrizione prodotto: " + prodotto1.getDescription());
		  
        prodotto1.setDescription("bellissimo prodotto");

		System.out.println("Nuova descrizione prodotto: " + prodotto1.getDescription());
	
        prodotto1.setPrice(100.01);

		System.out.println("Nuovo prezzo del prodotto: " + prodotto1.getPrice());

		prodotto1.setTax(15);

		System.out.println("Nuova iva del prodotto: " + prodotto1.getTax());
		  
		System.out.println("Nuovo prezzo intero del prodotto: " + prodotto1.getFullPrice());

		System.out.println("Codice prodotto: " + prodotto1.getCode());
		  
		//utilizzo del metodo statico della classe Prodotto per restituire il codice formattato con 8 zeri a sinistra
		System.out.println("Codice prodotto in forma intera: " + Prodotto.getPaddedCode(prodotto1.getCode()));	  
	}
}
