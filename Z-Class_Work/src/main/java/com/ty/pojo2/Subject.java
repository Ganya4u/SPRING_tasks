package com.ty.pojo2;

public class Subject {
	
	int id;
    String name;
    
	
	
	
	public Subject() {
		super();
	}




	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " - " + name;
    }



	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
    
	
}
