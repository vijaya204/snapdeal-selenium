@Tc_Register_003
Feature: Register with credentials

 Scenario: Registration
    Given user open Chromebrowser and enter url  "https://www.snapdeal.com"
    Then Click on Signin
    And click on Register
    Then enter "vijayagolla324@gmail.com"
    And Clicks on Continue
   Then User enters "8008789565", "Vijaya Lakshmi Golla" 
    And  User clicks on Continue
    
    