@Login
Feature: Loginpage 

@Tc_Login_001
Scenario: Successful Login
  Given user opens Chromebrowser and enter url as "https://www.snapdeal.com/"
  Then Click on signin
  And Click on Login
  Then enter mobilenumber/email as "vijayagolla204@gmail.com" 
  And Click on Continue
  Then enters Username and password as "vijaya2016"
  Then clicks on Login button
  
@Tc_Login_002
Scenario: Unsuccessful Login
  Given user opens Chromebrowser and enter url as "https://www.snapdeal.com/"
  Then Click on signin
  And Click on Login
  Then enter mobilenumber/email as "vijayagolla204@gmail.com" 
  And Click on Continue
  Then enters Username and  invalid password as "vijaya204"
  Then clicks on Login button

@TC_Login_003
Scenario: Unsuccessful Login

Given user opens Chromebrowser and enter url as "https://www.snapdeal.com/"
Then Click on signin
And Click on Login
Then enter mobilenumber/email as "vijayagolla204@gmail.com"
And Click on Continue
Then clicks on Login button   