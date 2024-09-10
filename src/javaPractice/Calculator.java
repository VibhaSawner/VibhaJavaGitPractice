package javaPractice;

public class Calculator {

	int number1=10;
	int number2=20;
	int ans=0;
	
	void sum() {
		ans=number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	void sub() {
		ans=number2-number1;
		System.out.println("Subtraction is "+ans);
	}
	
	void mul() {
		ans=number1*number2;
		System.out.println("multiplication is "+ans);
	}
	
	void div() {
		ans=number2/number1;
		System.out.println("division is "+ans);
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.sum();
		cal.sub();
		cal.mul();
		cal.div();
	}
}
