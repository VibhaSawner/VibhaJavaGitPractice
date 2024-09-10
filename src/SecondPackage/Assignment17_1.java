package SecondPackage;

public class Assignment17_1 {
	
	void reverseString(String str) {
		for(int i=str.length()-1;i>=0;i--){
				System.out.println(str.charAt(i));
		}
	}
	
	void evenStringreverse(String str) {
		for(int i=str.length()-2;i>=0;i=i-2) {
			System.out.println(str.charAt(i));
		}
	}
	
	void digitcountInString(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("number in digit "+count);
	}
	
	void sumOfDigitInString(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
		public static void main(String[] args) {
			Assignment17_1 assignment17_1=new Assignment17_1();
			//assignment17_1.reverseString("Maulik");
			//assignment17_1.evenStringreverse("technocredits");
			//assignment17_1.digitcountInString("Te8chno3cred7it9s");
			//assignment17_1.sumOfDigitInString("Te8chno3cred7it9s");
		}
}
