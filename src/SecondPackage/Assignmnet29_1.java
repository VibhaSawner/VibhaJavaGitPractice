package SecondPackage;

import java.util.Arrays;

public class Assignmnet29_1 {

	int[] m1(int num[]) {
		int count=0;
		int output[]=new int[num.length];
		for(int i=0;i<num.length;i++) {
			if(num[i]==0) {
				output[count]=num[i];
				count++;
			}
		}
		for(int j=0;j<num.length;j++) {
			if(num[j]!=0) {
				output[count]=num[j];
				count++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignmnet29_1  Assignmnet29_1 =new Assignmnet29_1 ();
		int num[]= {10,0,0,3,4,5,0,9};
		int ans[]=Assignmnet29_1 .m1(num);
		System.out.println(Arrays.toString(ans));
	}
}
