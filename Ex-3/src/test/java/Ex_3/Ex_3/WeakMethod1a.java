package Ex_3.Ex_3;

import org.junit.Test;

public class WeakMethod1a {
	
	// Error will be caught here. Test with less than 100% coverage
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero1() {
		WeakClass.weakMethod1(10, 0);
	}

}
