package SecondPackage;

public class Program2 {
	
	void m1(int dayIndex) {
		if(dayIndex>=1 && dayIndex<=5) {
			System.out.println("WeekDays");
		}else if(dayIndex>=6 && dayIndex<=7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		Program2 program2 =new Program2() ;
		program2.m1(6);
		program2.m1(3);
		program2.m1(-3);
		program2.m1(8);
		program2.m1(7);
	}
}
