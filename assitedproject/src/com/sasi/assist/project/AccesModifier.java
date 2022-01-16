package com.sasi.assist.project;


	

	//4. using public access specifiers

    class pubaccessspecifiers {
	public void display()
	{
	System.out.println("This is Public Access Specifiers");
	}
	}
	

	 class accessSpecifiers4 {
	public static void main(String[] args) {
	pubaccessspecifiers obj = new pubaccessspecifiers();
	obj.display();
	}
	}

	//2. using private access specifiers
	class priaccessspecifier
	{
	private void display()
	{
	System.out.println("You are using private access specifier");
	}
	}
	 class accessSpecifiers2 {
	public static void main(String[] args) {
	//private
	System.out.println("Private Access Specifier");
	priaccessspecifier obj = new priaccessspecifier();
	//trying to access private method of another class
	//obj.display();
	}
	}
	
	//1. Class is having Default access modifier
	class defAccessSpecifier
	{
	void display()
	{
	System.out.println("You are using defalut access specifier");
	}
	}
	public class AccesModifier {

	public static void main(String[] args) {
	//default
	System.out.println("Dafault Access Specifier");
	defAccessSpecifier obj = new defAccessSpecifier();
	obj.display();
	}
	}


