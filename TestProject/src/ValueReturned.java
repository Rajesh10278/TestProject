
public class ValueReturned {
 
	
	public String convert(int num) {
		
       if(num%5==0 && num%3==0) {
			
			return "FizzBuzz";
		}
		if(num%3==0) {
			
			return "Fizz";
		}
        if(num%5==0) {
			
			return "Buzz";
		}
        
        return String.valueOf(num);
	}
	
}
