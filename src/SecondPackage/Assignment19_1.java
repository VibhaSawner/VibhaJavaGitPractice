package SecondPackage;

public class Assignment19_1 {

	
	void sumOfNum(int[] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
	
	void sumOfPrime(int num[]) {
		int sum=0;
				
		for(int i=0;i<num.length;i++){
			int ans=prime(num[i]);
			sum=sum+ans;
		}
		System.out.println("sumof prime "+sum);
	}
	
	int prime(int num) {
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}if(flag==true) {
			return num;
		}
		return 0;
	}
	
	void findMaxNum(int num[]) {
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max +" = is maximun num in array");
	}
	
	void minnum(int num[]) {
		int min=num[0];
		for(int i=1;i<num.length;i++) {
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		Assignment19_1  assignment19_1 =new Assignment19_1 ();
		int num[]={10,11,15};
		//assignment19_1.sumOfNum(num);
		//int num1[]= {11,14,17,22,44};
		//assignment19_1.sumOfPrime(num1);
		int num2[]= {11,4,55,23,43};
		//assignment19_1.findMaxNum(num2);
		//assignment19_1 .minnum(num2);
	}
}
