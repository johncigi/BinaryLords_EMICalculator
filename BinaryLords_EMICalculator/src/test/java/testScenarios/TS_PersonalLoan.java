package testScenarios;



import mainFunctionalities.CarLoanFunctionalities;
import mainFunctionalities.HomeLoanFunctionalities;
import org.testng.annotations.*;

public class TS_PersonalLoan extends DriverSetup{
	
	public HomeLoanFunctionalities details2;
	public CarLoanFunctionalities details;
	
	@BeforeTest
	public void TC_initiateClasses()
	{
	   details2 = new HomeLoanFunctionalities();
	   details = new CarLoanFunctionalities();
	}
	
	@Test(priority=1)
	public void TC_personalLoanSelect()
	{
		details.selectLoan("personalLoan");
	}
	
	@Test(priority=2)
	public void TC_enterDetails() {
		details.enterDetails("2000000","7.5","2");
		
	}
	
	@Test(priority=3)
	public void TC_scrollDown()
	{
		details2.scrollDown();
	}

}
