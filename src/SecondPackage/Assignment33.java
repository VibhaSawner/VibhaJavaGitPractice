package SecondPackage;

public class Assignment33 {

	void m1(int [] arr) {
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[j]!=-1) {
					count++;
					arr[j]=-1;
				}
			}
			if(count==1 && arr[i]!=-1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void m2(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j]) && arr[j]!=-1){
					count++;
					arr[j]=-1;
				}
			}
			if(count>0 && arr[i]!=-1) {
				System.out.println(arr[i]);
			}
		}
	}
		
	public static void main(String[] args) {
		Assignment33 assignment33=new Assignment33();
		int [] arr= {10,20,30,10,40,20};
		assignment33.m1(arr);
		//assignment33.m2(arr);;
	}
}
