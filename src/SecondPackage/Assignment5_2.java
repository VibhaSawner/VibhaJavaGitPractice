package SecondPackage;

public class Assignment5_2 {

	void m1(int marks) {
		if(marks>=90 && marks<=100) {
			System.out.println("A+ very good job");
		}else if (marks>=80 && marks<=89) {
			System.out.println("A  good job");
		}else if(marks>=70 && marks<=79) {
			System.out.println("B+, you are improving");
		}else if(marks>=60 && marks<=69) {
			System.out.println("C+, keep reading");
		}else if(marks>=50 && marks<=59) {
			System.out.println("C, you can do better");
		}else {
			System.out.println("invalid index");
		}
	}
	public static void main(String[] args) {
		Assignment5_2 assignment5_2=new Assignment5_2();
		assignment5_2.m1(90);
		assignment5_2.m1(100);
		assignment5_2.m1(80);
		assignment5_2.m1(89);
		assignment5_2.m1(70);
		assignment5_2.m1(79);
		assignment5_2.m1(9);
	}
}
