import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DataSupplyAndTest {

	@Test
	public void Print() {
	    ValueReturned val= new ValueReturned();
		for(int i=1;i<=100;i++) {
			System.out.println(val.convert(i));
		}
	}
}
