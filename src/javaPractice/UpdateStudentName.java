package javaPractice;

public class UpdateStudentName {
	String name="vibha";
	int rollNo=10;
	
	void display() {
		System.out.println("student name is "+name+ " , "+rollNo);
	}
	
	void update() {
		name="vibhu";
	}
	
	public static void main(String[] args) {
		UpdateStudentName name=new UpdateStudentName();
		name.display();
		name.update();
		name.display();
	}
}
