package javaPractice;

public class ShashankBhaiyaEx1 {
//String str="Welcome to Globant"
	//output=> "emocleW ot tnabolG "
	
	public static void main(String[] args) {
		ShashankBhaiyaEx1 shashankBhaiyaEx1=new ShashankBhaiyaEx1();
		shashankBhaiyaEx1.m1("Welcome to Globant");
	}
	
	void m1(String str) {
		String newString="";
		
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String revString=m2(arr[i]);
			newString=newString+revString+" ";
			
		}
		System.out.println(str);
		System.out.println("..................");
		System.out.println(newString);
	}
	
	String m2(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		return str1;
	}
	 
}
