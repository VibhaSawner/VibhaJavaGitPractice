package SecondPackage;

public class Assignment21_1 {
	int[] m1(int num[]) {
		int output[]=new int [num.length];
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					output[i]=num[j];
				}
			}
		}
		return output;
	}
	

	public static void main(String[] args) {
		Assignment21_1 assignment21_1=new Assignment21_1();
		int num[]= {10,99,33,44,89,76};
		int []arr=assignment21_1.m1(num);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
