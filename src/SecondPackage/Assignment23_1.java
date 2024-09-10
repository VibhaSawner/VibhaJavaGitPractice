package SecondPackage;

import java.util.Arrays;

public class Assignment23_1 {
	void m1(String str) {
		String[] arr=str.split(" ");
		int maxLength=arr[0].length();
		String maxStringlength=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i].length()>maxLength) {
				maxLength=arr[i].length();
				maxStringlength=arr[i];
			}
		}
		System.out.println(maxLength+" "+maxStringlength);
	}
	public static void main(String [] args) {
		Assignment23_1 assignment23_1=new Assignment23_1();
		assignment23_1.m1("Good morning friends this is technocredits");
	}
}
