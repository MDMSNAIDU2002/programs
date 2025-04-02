package BasicPrograms;

public class nullpointer {
	 public static void main(String[] args) {  
	        String str = null;  
	        try {  
	            int length = str.length();  
	        } 
	        catch (NullPointerException e)
	        {  
	            System.out.println("Error: Null reference encountered.");  
	              
	        }  
	    }  

}
