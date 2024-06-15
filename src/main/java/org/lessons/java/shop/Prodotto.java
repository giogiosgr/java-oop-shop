package org.lessons.java.shop;

public class Prodotto {
	final private int code;
	private String name;
	private String description;
	private double price;
	private double tax;
	
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
    
    public void setPrice(double newPrice) {
    	this.price = newPrice;	
    }
    	
    //restituzione del prezzo come stringa, comprensivo di IVA, arrotondato troncato due decimali
  	public String getFullPrice () {
  		double temp = this.price + (this.price * (this.tax / 100));
  		return String.format("%.2f", temp); 
  	}
  	
  	public String getFullName () {
  		return code + "-" + name;
  	}
  	
  	public String getName() {
  		return this.name;
  	}
  	
  	public void setName(String newName) {
  		this.name = newName;
  	}
  	
  	public String getDescription() {
  		return this.description;
  	}
  	
  	public void setDescription(String newDescription) {
  		this.description = newDescription;
  	}
  	
    public int getCode() {
    	return this.code;
    }
  	
}
