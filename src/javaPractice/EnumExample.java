package javaPractice;

public class EnumExample {

	enum NEWOne{
		
		Good ("vibha"),
		BAD("chotu"),
		MODERATE("krishna");
		
		public String name;
		
		private NEWOne(String name) {
			this.name=name;
		}
		
	}
	
	public void goToMenu(NEWOne Menuname) {
		String str=Menuname.name;
		System.out.println(str);
	}
	
	
	public  void test(){
		goToMenu(NEWOne.Good);
	}
	
	public static void main(String[] args) {
		EnumExample enumExample=new EnumExample();
		enumExample.test();
	}
}
