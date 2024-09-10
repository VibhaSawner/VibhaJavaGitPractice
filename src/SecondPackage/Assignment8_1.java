package SecondPackage;

public class Assignment8_1 {

	void m1(int num) {
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==false) {
			System.out.println("not prime");
		}
	}
	public static void main(String[] args) {
		Assignment8_1 assignment8_1=new Assignment8_1();
		assignment8_1.m1(15);
	}
}
