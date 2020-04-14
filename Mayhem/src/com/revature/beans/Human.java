package com.revature.beans;
//Packages are just very fancy folders
//Nming Conventions
//classes and Projects: Pascal casing, capitalize the first letter of each word, ex.. ProjectMayhem
//Methos and variables: Camel Casing, first word lower case and the rest upper case.
//packages: lower case and delimited by periods
//Constants: everything upper case, ALL_CAPS
public class Human {
	//Members of a class- couple of forms
		//Instance variables- property of a specific object ex.. human's name
		//Static Variables- property of the class shared by all of its instances
		//Instance methods- behavior relative to a specific object
		//Static methods- behavior relative to a entire class
		//constructor- instantiate the class using the keyword "new"
	public String name;
	public int age;
	public int weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}


}
