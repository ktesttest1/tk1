
public class Methodex1 {

	public static void main(String[] args) {
		
		ageCheck();
		
		boolean b1 = ageCheck1(15);
		
		if(b1==true) {
			System.out.println("The person is eligible to user");
		}
		else {
			System.out.println("The person is not eligible to user");
		}
		
		
		
	}
	
	public static void ageCheck() {
		
	 int age = 17;
	 
	 if(age>=16) {
		 System.out.println("The user is eligible to drive");
	 }
	 else
	 {
		 System.out.println("The user is not  eligible to drive");
	 }
	}
	
	public static boolean ageCheck1(int a) {
		
		boolean b = false;
		
		if(a>=16) {
			
			 b = true;
			
			
		}
		
		return b;
	}
	

}
