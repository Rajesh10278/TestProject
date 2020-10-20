import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestingClass {
	
	@Test
	public void multipleOfThreeAndFive() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("FizzBuzz", p.convert(15));
	}

	@Test
	public void multipleOfThree() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("Fizz", p.convert(3));
	}
	
	@Test
	public void multipleOfFive() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("Buzz", p.convert(5));
	}
	
	@Test
	public void normalNumber() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("1", p.convert(1));
	     Assert.assertEquals("2", p.convert(2));
	}
    
}
