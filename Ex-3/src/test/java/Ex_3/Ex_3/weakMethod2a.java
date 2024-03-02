package Ex_3.Ex_3;
import org.junit.Test;

public class weakMethod2a {
	
	// Division by zero error
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero2() {
		WeakClass.weakMethod2(5,0);
	}

}
