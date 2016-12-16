package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;
import org.hibernate.HibernateException;

import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static RateDomainModel getSingleRate(int GivenCreditScore){
ArrayList<RateDomainModel> allRates = RateDAL.getAllRates();
		
		for (RateDomainModel rate : allRates) {
			if (rate.getiMinCreditScore() >= GivenCreditScore){
				return rate;
			}
			
		}
		return null;	
	}
	
	public static double getRate(int GivenCreditScore) 
	{
		try{
			getSingleRate(GivenCreditScore);
		}
		catch (HibernateException e){
			e.printStackTrace();
		}
		return getSingleRate(GivenCreditScore).getdInterestRate();
		
	}
	
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
