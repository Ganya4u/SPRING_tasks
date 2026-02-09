package com.ty.pojo2;

import java.util.Map;

public class Shop {
	
	 String name;
	  Map<String, Double> items;
	  
	  
	  
	  
	  
	  public Shop() {
		super();
	}




	  public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}




	  public void display() {
		    System.out.println("Shop Name: " + name);

		    if (items != null && !items.isEmpty()) {
		        System.out.println("Items:");
		        for (Map.Entry<String, Double> entry : items.entrySet()) {
		            System.out.println(
		                "Item: " + entry.getKey() + " | Price: " + entry.getValue()
		            );
		        }
		    } else {
		        System.out.println("No items available.");
		    }
		}

	  

}
