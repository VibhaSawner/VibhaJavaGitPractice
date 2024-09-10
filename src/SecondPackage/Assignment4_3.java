package SecondPackage;

public class Assignment4_3 {

	void m1(int index) {
		if(index==1 || index==2 ||index ==3) {
			System.out.println("FY2022 Q1");
		}else if(index== 4 || index==5 || index==6) {
			System.out.println("FY2022 Q2");
		}else if(index==7 || index==8 || index ==9) {
			System.out.println("FY2022 Q3");
		}else if(index==10 || index==11 || index==12) {
			System.out.println("FY2022 Q4");
		}else {
			System.out.println("invalid");
		}
	}
	public static void main(String[] args) {
		Assignment4_3 assignment4_3=new Assignment4_3();
		assignment4_3.m1(1);
		assignment4_3.m1(6);
		assignment4_3.m1(15);
	}
}
