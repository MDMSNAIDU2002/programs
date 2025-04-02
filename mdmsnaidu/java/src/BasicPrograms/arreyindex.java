package BasicPrograms;

public class arreyindex {
	  public static void main(String[] args) {  
	        int[] numbers = {1, 2, 3, 4, 5};  
	        try {  
	            int index = 10;  
	            int value = numbers[index];  
	            System.out.println("Value at index " + index + ": " + value);  
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {  
	            System.out.println("Error: Index is out of bounds.");  
	           
	        }  
	    }  

}

