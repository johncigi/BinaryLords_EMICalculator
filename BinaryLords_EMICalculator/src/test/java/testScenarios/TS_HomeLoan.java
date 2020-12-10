package testScenarios;


import mainFunctionalities.CarLoanFunctionalities;
import mainFunctionalities.HomeLoanFunctionalities;

import org.testng.annotations.*;


public class TS_HomeLoan extends DriverSetup{
	
	public HomeLoanFunctionalities details2;
	public CarLoanFunctionalities details;

	@BeforeTest
	public void TC_initiateClasses()
	{
	   details2 = new HomeLoanFunctionalities();
	   details= new CarLoanFunctionalities();
	}
	
	@Test(priority=1)  
	public void TC_homeLoanSelect()
	{
		
		details2.scrollUp();
		details.selectLoan("homeLoan");
		
	}
	
	@Test(priority=2)
	public void TC_readHomeLoanData ()
	{
		details2.inputData("HomeLoan");
	}
	
	@Test(priority=3)
	public void TC_scrollDown()
	{
		details2.scrollDown();
	}
	
	@Test(priority=4)            
	public void TC_yearWiseData()
	{
		details2.writeYearWiseData();
		
	}
}
