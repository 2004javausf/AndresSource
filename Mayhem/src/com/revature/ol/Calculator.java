package com.revature.ol;

public class Calculator {
 public static void main(String[] args) {
	 
	add(3,6);
	add(1.3,4.5);
	add(1.3,4.5,5.6);
}
 //Parametric Polymorphism
 static int add(int a, int b) {
	 System.out.println(a+b);
	 return a+b;
 }
//Parametric Polymorphism
 static double add(double a, double b) {
	 System.out.println(a+b);
	 return a+b;
 }
 
 static double void add(double a, double b, double c) {
	 System.out.println(a+b);
	 //return a+b;
 }
 
}
