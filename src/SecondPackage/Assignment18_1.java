package SecondPackage;

public class Assignment18_1 {

	void rearrange(String str) {
		String digit="";
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			 if(Character.isDigit(ch)) {
				 digit=digit+ch;
			 }else if(Character.isLetter(ch)) {
				 str1=str1+ch;
			 }
		}
		System.out.println(digit+""+str1+ " ");
	}
	
	void rearrUpDiLo(String str) {
		String UpperCase="";
		String Digit="";
		String lower="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				Digit=Digit+ch;
			}else if(Character.isUpperCase(ch)) {
				UpperCase=UpperCase+ch;
			}else if(Character.isLowerCase(ch)) {
				lower=lower+ch;
			}
		}
		System.out.println(UpperCase+""+Digit+""+lower);
	}
		void frequncyofChar(String str) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(Character.toLowerCase(ch)=='t') {
					count++;
				}
			}
			System.out.println("frequncy of t = > "+count);
		}
		
	public static void main(String[] args) {
		Assignment18_1  assignment18_1 =new Assignment18_1 ();
		//assignment18_1.rearrange("te2cH4no");
		//assignment18_1.rearrUpDiLo("t8EcHNo5Cred3iTs");
		//assignment18_1.frequncyofChar("TechnoTtcredits");
	}
}
