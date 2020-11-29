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
	}
	
	@Test(priority=5)
	public void TC_homeLoanSelect()
	{
		
		details2.scrollUp();
		details2.selectHomeLoan();
		
	}
	
	@Test(priority=6)
	public void TC_readHomeLoanData ()
	{
		details2.inputData("HomeLoan");
	}
	
	@Test(priority=7)
	public void TC_ScrollDown()
	{
		details2.scrollDown();
	}
	
	@Test(priority=8)
	public void TC_YearWiseData()
	{
		details2.writeYearWiseData();
		
	}
}
