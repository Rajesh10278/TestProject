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

}
