package SecondPackage;

public class Assignment30_1 {

	
	void m1(int num[]) {
		for(int i=0;i<num.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j] && i!=j) {
					flag=true;
					num[j]=0;
				}
			}
			if(flag==true) {
				System.out.println(num[i]+ " is a duplicate");
			}
			
		}
	}
	public static void main(String[] args) {
		Assignment30_1 assignment30_1=new Assignment30_1();
		int num[]={10,12,44,12,77,67,12,44};
		assignment30_1.m1(num);
	}
}
