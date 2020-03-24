
public class Testclass5 {
	
 public static void main(String[] args){
	 
	 
       details("test");
        
        for(int x = 1; x<=100; x++){
        	
       boolean v =  divisbilityEight(x);
       
       if(v==true) {
    	   System.out.println(x);
       }
            
        }
    }
    public static boolean divisbilityEight(int x){
        boolean value;
        if(x%8==0){
            value = true;
        }
        else{
            value = false;
        }
        return value;
    }
    
    
    public static void details(String s) {
    	
    	System.out.println(s);
    	
    }
}
