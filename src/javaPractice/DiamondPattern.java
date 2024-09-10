package javaPractice;

public class DiamondPattern {

	void m1() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j<=i;j--) {
				System.out.print("*");
			}
			System.out.print("");
		}
	}
	
	public static void main(String[] args) {
		DiamondPattern diamondPattern=new DiamondPattern();
		diamondPattern.m1();
	}
}
