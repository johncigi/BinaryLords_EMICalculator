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
	public void TC_carLoanSelect() {
		details.selectCarLoan();
	}
	
	@Test(priority=2)
	public void TC_enterDetails() {
		details.enterDetails("1500000","9.5","1");
		
	}
	
	@Test(priority=3)
	public void TC_selectMonth(){
		details.scrollDown();
		details.selectMonth();
	}
	
	@Test(priority=4)
	public void TC_displayResult() {
		details.printResult();                    
	}                                                         
	
	

}
