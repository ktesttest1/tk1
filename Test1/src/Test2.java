
public class Test2 {
	
	int a;//global/instace variable
	static int c;//static/class variables
	
	public void test(){
		
		System.out.println(a);
		//System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		try
		{
	//int b=7;
	//System.out.println(b/0);
			String s = null;
			System.out.println(s.length());
		}catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	
	System.out.println("rest of the program");
	
	
	

	}

}
