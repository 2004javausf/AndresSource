package com.revature.first;

import com.revature.beans.Human;


public class Driver {
	
	public static void main(String[] args) {
		//public- access modifier, everything can access it
		//static- do not to instantiate in order to use/belongs to the class
		//void- does not return anything
		//String[] args- parameters used for this method
		System.out.println("Roll Tide");
		Human h= new Human();
		System.out.println(h);
		h.setName("Andres");
		h.setAge(36);
		h.setWeight(155);
		System.out.println(h.getName()+" "+h.getAge());
	}
}
