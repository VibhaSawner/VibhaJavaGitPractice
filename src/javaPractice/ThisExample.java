package javaPractice;

import  javaPractice.InheritanceExam1;

public class ThisExample extends  InheritanceExam1 {

	String name;
	int roll;
	
	void m1(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
	//this indicate a instance variaable 
	
	void display() {
		System.out.println(name+ " : "+roll);
	}
	
	public static void main(String[] args) {
		ThisExample thisExample=new ThisExample();
		 thisExample.m1("vibha",10);
		 thisExample.display();
		 thisExample.m1();
		 InheritanceExam1 exam=new  InheritanceExam1 ();
		 exam.m1();
		 
	}
}
