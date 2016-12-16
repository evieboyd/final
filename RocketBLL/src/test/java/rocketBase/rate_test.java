package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

public class rate_test {
	double a = RateBLL.getRate(650);

	
	@Test
	public void rate_test() {
		
		assert(a == 4.5);
	}
	@Test(expected = Exception.class)
	public void rate_test2() {
		RateBLL.getRate(400);
	}
	@Test
	public void payment_test(){
		double pay = RateBLL.getPayment(0, 1, 1, 1, true);
		assert(pay == -2);
	}

}
