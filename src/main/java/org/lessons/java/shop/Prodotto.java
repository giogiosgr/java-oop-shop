package org.lessons.java.shop;

public class Prodotto {
	private int code;
	String name;
	String description;
	double price;
	int tax;
	
    public Prodotto(String name, String description, double price, int tax) {
    	//randomico compreso tra 1 e 99999999
    	this.code = 1 + (int) (Math.random() * 99999999);
    	this.name = name;
    	this.description = description;
    	this.price = price;
    	this.tax = tax;
    }
    	
    public double getPrice() {
    	return this.price;	
    }
    	
  

}
