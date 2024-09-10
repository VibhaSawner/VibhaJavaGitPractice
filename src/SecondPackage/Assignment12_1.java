package SecondPackage;

public class Assignment12_1 {

	void m1(int x, int y) {
		for(int i=100;i<=120;i++) {
			m2(i);
		}
	}
	void m2(int num) {
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}if(flag==true) {
			System.out.println("is prime "+num);
		}
	}
	
	public  static void main(String[] args) {
		Assignment12_1 assignment12_1=new Assignment12_1();
		assignment12_1.m1(100,120);

	}
	}
