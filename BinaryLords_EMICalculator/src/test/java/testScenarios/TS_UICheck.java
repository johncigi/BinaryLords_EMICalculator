package testScenarios;

import mainFunctionalities.HomeLoanFunctionalities;
import mainFunctionalities.LoanCalculatorFunctionalities;

import org.testng.annotations.*;


public class TS_UICheck extends DriverSetup {
	public LoanCalculatorFunctionalities details3;
	public HomeLoanFunctionalities details2;
	
	@BeforeTest
	public void TC_initiateClasses()
	{
		
		details3 = new LoanCalculatorFunctionalities();
		
	}
	
	@Test(priority=9)
	public void TC_selectLoanCalculator(){
		details3.scrollUp();
		details3.selectLoanCalculator();
	
	}
	
	@Test(priority=10)
	public void TC_emiCalculator() throws Exception{
		details3.selectCalculator("emiCalculator");
		
		details3.checkLoanAmtTextBox("5000", "//input[@id='loanamount']");
		details3.checkInterestRateTextBox("2.5", "//input[@id='loaninterest']");
		details3.checkLoanTenureTextBox("6", "//input[@id='loanterm']");
		details3.checkFeesChargesTextBox("5000", "//input[@id='loanfees']");
		System.out.println("EMI Calculator textboxes are checked");
		
		details3.checkLoanAmtSlider("//div[@id='loanamountslider']","//input[@id='loanamount']","EMI Calculator");
		details3.checkInterestRateSlider("//div[@id='loaninterestslider']","//input[@id='loaninterest']","EMI Calculator");
		details3.checkLoanTenureSlider("//div[@id='loantermslider']","//input[@id='loanterm']","EMI Calculator");
		details3.checkFeesChargesSlider("//div[@id='loanfeesslider']","//input[@id='loanfees']","EMI Calculator");
		
		}
	
	@Test(priority=11)
	public void TC_loanAmountCalculator () throws Exception{
		details3.selectCalculator("loanAmountCalculator");
		
		details3.checkEMITextBox("4999.92", "//input[@id='loanemi']");
		details3.checkInterestRateTextBox("2.5", "//input[@id='loaninterest']");
		details3.checkLoanTenureTextBox1("6", "//input[@id='loanterm']");
		details3.checkFeesChargesTextBox("5000", "//input[@id='loanfees']");
		System.out.println("Loan Amount Calculator textboxes are checked");
		
	    details3.checkEMISlider("//div[@id='loanemislider']","//input[@id='loanemi']","Loan Amount Calculator");
		details3.checkInterestRateSlider("//div[@id='loaninterestslider']","//input[@id='loaninterest']","Loan Amount Calculator");
		details3.checkLoanTenureSlider("//div[@id='loantermslider']","//input[@id='loanterm']","Loan Amount Calculator");
		details3.checkFeesChargesSlider("//div[@id='loanfeesslider']","//input[@id='loanfees']","Loan Amount Calculator");
		
		}
	@Test(priority=12)
	public void TC_loanTenureCalculator () throws Exception{
		details3.selectCalculator("loanTenureCalculator");
		
		details3.checkLoanAmtTextBox("5000", "//input[@id='loanamount']"); 
		details3.checkInterestRateTextBox("2.5", "//input[@id='loaninterest']");
		details3.checkFeesChargesTextBox("5000", "//input[@id='loanfees']");
		details3.checkEMITextBox("5010.42", "//input[@id='loanemi']");
		System.out.println("Loan Tenure Calculator textboxes are checked");
		
		details3.checkLoanAmtSlider("//div[@id='loanamountslider']","//input[@id='loanamount']","Loan Tenure Calculator");
		details3.checkEMISlider("//div[@id='loanemislider']","//input[@id='loanemi']","Loan Tenure Calculator");
		details3.checkLoanTenureSlider("//div[@id='loaninterestslider']","//input[@id='loaninterest']","Loan Tenure Calculator");
		details3.checkFeesChargesSlider("//div[@id='loanfeesslider']","//input[@id='loanfees']","Loan Tenure Calculator");
		
	}
	

}
