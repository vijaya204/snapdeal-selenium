@TC_Login_003
Feature: Loginpage Without password

Scenario: Unsuccessful Login

Given user opens Chromebrowser and enter url as "https://www.snapdeal.com/"
Then Click on signin
And Click on Login
Then enter mobilenumber/email as "vijayagolla204@gmail.com"
And Click on Continue
Then clicks on Login button

 