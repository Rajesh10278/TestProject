import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestingClass {

	@Test
	public void multipleOfThree() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("Fizz", p.convert(3));
	}

}
