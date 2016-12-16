package rocketBase;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.transaction.Transaction;

import org.junit.BeforeClass;
import org.junit.Test;


import rocketDomain.RateDomainModel;

public class Rate_Test {
	private static RateDomainModel rate1;
	private static int id1 = 100;
	private static int credit1 = 300;
	private static double interest1 = 0.05;
	

	
	/*/@BeforeClass
	public static void rateInstance() {
		
		 rate1 = new RateDomainModel();
		 
		
		
		rate1.setiRateID(id1);
		rate1.setiMinCreditScore(credit1);
		rate1.setdInterestRate(interest1);
	}/*/
	

	
	@Test
	public void test() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		assert(1==1);
	}
	
	@Test(expected = Exception.class)
	public void rate_test(){
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		
	}

}
