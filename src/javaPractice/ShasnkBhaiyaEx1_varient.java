package javaPractice;

public class ShasnkBhaiyaEx1_varient {
	//String str="Welcome to Globant"
		//output=> "tnabolG ot emocleW "
	
	void m1(String str) {
		String revstr="";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			String revoutputString=m2(arr[i]);
			revstr=revstr+revoutputString+" ";
		}
		System.out.println(str);
		System.out.println("...........");
		System.out.println(revstr.trim());
	}
	
	String m2(String str) {
		String newrevString="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			newrevString=newrevString+ch;
		}
		return newrevString;
	}
	
	public static void main(String[] args) {
		ShasnkBhaiyaEx1_varient  shasnkBhaiyaEx1_varient =new ShasnkBhaiyaEx1_varient ();
		shasnkBhaiyaEx1_varient.m1("Welcome to Globant");
	}
	
}
