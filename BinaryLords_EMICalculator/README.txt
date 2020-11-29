
Problem Statement : Find the Interest Amount for current year

1. Buying a car of 15 Lac
2. Interest rate of 9.5% 
3. Tenure should be 1 year. 
Display the interest amount & principal amount of first month. 
(Suggested Site: emicalculator.net / HDFCbank.com etc. however you are free to use any other legitimate site)

Detailed Description: Hackath Ideas

1. Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year;
   Display the interest amount & principal amount for one month. 
2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from year on year table & store in excel; 
3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; 
   change the Loan tenure for year & month,check the change in scale;     
   Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator 
   (Suggested Site: emicalculator.net however you are free to use any other legitimate site)


Pre-requisites:

(1) Java version used: jdk1.8.0.261
(2) Selenium version used: 3.141.59.jar
(3) Testng version used: 7.0.0
(4) Maven version used: 3.6.3
(5) Commons-io version used: 2.6
(6) Apache poi version used: 4.1.2
(7) Extend report version used : 3.1.5
(8) Jenkins version : 2.249.3
(9) Selenium grid version: selenium-server-standalone-3.141.59
(10) Chrome browser version: 86.0.4240.198
(10) Firefox browser version: 83.0

Solution:

REQUIREMENT 1

1. Navigate to "https://www.emicalculator.net/" website.

2. Select "Car Loan" option.

3. Enter "150000" in the Car Loan Amount textbox field.

4. Enter "9.5" in the Interest rate textbox field.

5. Enter "1" in the Loan Tenure textbox field.

6. Scroll down the page to locate the results.

7. Wait for interest amount and principle amount to be displayed.

8. Take screenshot of the page.

9. Store the displayed results in an excel file.

REQUIREMENT 2

1. Select "Home Loan" option.

2. Enter "150000" in the Home Loan Amount textbox field.

3. Enter "9.5" in the Interest rate textbox field.

4. Enter "1" in the Loan Tenure textbox field.

5. Scroll down the page to locate the results.

6. Wait for interest amount and principle amount to be displayed.

7. Take screenshot of the page.

8. Store the displayed results in an excel file.

REQUIREMENT 3

1. Click on "Calculator" dropdown menu.

2. Select "Loan Calculator" option the dropdown options.

3. Select "EMI Calculator".

4. Do all UI check for text box & scales.

5. Change the Loan tenure for year & month.

6. Check the change in scale.

7. Take screenshot of the page.

REQUIREMENT 4

1. Click on "Calculator" dropdown menu.

2. Select "Loan Calculator" option the dropdown options.

3. Select "Loan Amount Calculator".

4. Do all UI check for text box & scales.

5. Change the Loan tenure for year & month.

6. Check the change in scale.

7. Take screenshot of the page.

REQUIREMENT 5

1. Click on "Calculator" dropdown menu.

2. Select "Loan Calculator" option the dropdown options.

3. Select "Loan Tenure Calculator".

4. Do all UI check for text box & scales.

5. Change the Loan tenure for year & month.

6. Check the change in scale.

7. Take screenshot of the page.

8. Close the opened browser.



------------------------------------------------------------------------------------------------------------------------------------------------
#To Run the test with specified browser only use:
------------------------------------------------------------------------------------------------------------------------------------------------

1. chrome.xml
2. firefox.xml

--------------------------------------------------------------------------------------------------------------
#test-output :
--------------------------------------------------------------------------------------------------------------

Browser selected: chrome
Principal amount for one month: Rs 1,19,650
Interest amount for one month: Rs 11,875
Car Loan File created successfully
************************************************************
Home Loan File created successfully
************************************************************
EMI Calculator slider for loanamount is working and the value is being reflecting in the textbox: 1,03,00,000
EMI Calculator slider for loaninterest is working and the value is being reflecting in the textbox: 10.25
EMI Calculator slider for loantenure is working and the value is being reflecting in the textbox: 186
EMI Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500
Loan Amount Calculator slider for loanemi is working and the value is being reflecting in the textbox: 51,499.94
Loan Amount Calculator slider for loaninterest is working and the value is being reflecting in the textbox: 10.25
Loan Amount Calculator slider for loantenure is working and the value is being reflecting in the textbox: 186
Loan Amount Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500
Loan Tenure Calculator slider for loanamount is working and the value is being reflecting in the textbox: 1,03,00,000
Loan Tenure Calculator slider for loanemi is working and the value is being reflecting in the textbox: 51,498.16
Loan Tenure Calculator slider for loantenure is working and the value is being reflecting in the textbox: 10.25
Loan Tenure Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500

Browser selected: firefox
Principal amount for one month: ? 1,19,650
Interest amount for one month: ? 11,875
Car Loan File created successfully
************************************************************
Home Loan File created successfully
************************************************************
EMI Calculator slider for loanamount is working and the value is being reflecting in the textbox: 1,03,00,000
EMI Calculator slider for loaninterest is working and the value is being reflecting in the textbox: 10.25
EMI Calculator slider for loantenure is working and the value is being reflecting in the textbox: 186
EMI Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500
Loan Amount Calculator slider for loanemi is working and the value is being reflecting in the textbox: 51,499.94
Loan Amount Calculator slider for loaninterest is working and the value is being reflecting in the textbox: 10.25
Loan Amount Calculator slider for loantenure is working and the value is being reflecting in the textbox: 186
Loan Amount Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500
Loan Tenure Calculator slider for loanamount is working and the value is being reflecting in the textbox: 1,03,00,000
Loan Tenure Calculator slider for loanemi is working and the value is being reflecting in the textbox: 51,498.16
Loan Tenure Calculator slider for loantenure is working and the value is being reflecting in the textbox: 10.25
Loan Tenure Calculator slider for loanfees is working and the value is being reflecting in the textbox: 51,500


------------------------------------------------------------------------------------------------------------------------------------------------
#Testing on Selenium Grid
------------------------------------------------------------------------------------------------------------------------------------------------

1.Create a Selenium Grid Hub
      java -jar selenium-server-standalone-3.141.59.jar -role hub

2.Create one node in the Grid
      java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.12:5555/grid/register -port 4446

3.Change the code by uncommenting the GridDriver() method in Utilities class of userDefinedLibraries package

4.Run the test

-----------------------------------------------------------------------------------------------------------------------------------------------
#Hackathon Suites
-----------------------------------------------------------------------------------------------------------------------------------------------

1.Firefox_Suite
2.Chrome_Suite
3.Smoke Suite
4.Regression Suite

----------------------------------------------------------------------------------------------------------------------------------------------
# Tech Used:
----------------------------------------------------------------------------------------------------------------------------------------------

1.Java
2.Eclipse IDE
3.Selenium Framework
4.TestNG Framework
5.Maven Tool
6.Apache POI
7.POM
8.Extent HTML Report
9.Git
10.Jenkins
11.Selenium Grid