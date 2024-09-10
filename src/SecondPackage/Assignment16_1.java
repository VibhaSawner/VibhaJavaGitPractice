package SecondPackage;

public class Assignment16_1 {

	void strlength(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
				sum++;
		}
		System.out.println(sum+" : " +str);
	}
	
	char middleChar(String str) {
		int i=0;
		if(str.length()/2==0) {
		      i=str.length()/2+1;
		}else {
			 i=str.length()/2;
		}
		char ch=str.charAt(i);
	      return ch;
	}
	public static void main(String[] args) {
		Assignment16_1 assignment16_1=new Assignment16_1();
		assignment16_1.strlength("vibha");
		char ch=assignment16_1.middleChar("vibhas");
		System.out.println(ch+ " middle char of vibha ");
	}
}
