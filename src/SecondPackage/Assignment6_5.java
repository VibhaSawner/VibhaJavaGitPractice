package SecondPackage;

public class Assignment6_5 {

	void findSum() {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+i;
		}
		System.out.println(sum+" = is sum");
		System.out.println(".............");
	}
	
	void reverseNum() {
		for(int i=20;i>=10;i--) {
			if(i%2!=0) {
				System.out.println(i+" reverse odd number");
			}
		}
	}
	public static void main(String[] args) {
		Assignment6_5 assignment6_5=new Assignment6_5();
		assignment6_5.findSum();
		assignment6_5.reverseNum();
	}
}
