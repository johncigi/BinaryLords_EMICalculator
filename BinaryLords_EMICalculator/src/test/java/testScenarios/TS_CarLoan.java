package testScenarios;

import mainFunctionalities.CarLoanFunctionalities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_CarLoan extends DriverSetup {
	
public  CarLoanFunctionalities details;
	
    @BeforeTest
	public void TC_initiate() {
		details = new CarLoanFunctionalities();
	}
	
	@Test(priority=1)
	public void TC_CarLoanSelect() {
		details.selectCarLoan();
	}
	
	@Test(priority=2)
	public void TC_EnterDetails() {
		details.enterDetails("1500000","9.5","1");
		
	}
	
	@Test(priority=3)
	public void TC_SelectMonth(){
		details.scrollDown();
		details.selectMonth();
	}
	
	@Test(priority=4)
	public void TC_DisplayResult() {
		details.printResult();                    
	}                                                         
	
	

}
