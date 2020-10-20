import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestingClass {

	@Test
	public void fizzBuzzNumber() {
	     ValueReturned p= new ValueReturned();
	     Assert.assertEquals("1", p.convert(1));
	}

}
