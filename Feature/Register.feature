@Tc_Register_001_002
Feature: Register with credentials

 Scenario Outline: Registration
    Given user open Chromebrowser and enter url  "https://www.snapdeal.com"
    Then Click on Signin
    And click on Register
    Then enter "<email>"
    And Clicks on Continue
   Then User enters "<mobilenumber>", "<name>" and "<password>" 
    And  User clicks on Continue
    
    Examples:
    | email | mobilenumber | name | password |
    | vijayagolla324@gmail.com | 8008789565 | Vijaya Lakshmi Golla | vijaya2016 | 
    | vijayagolla324@gmail.com | 8008789565 | Vijaya Lakshmi Golla | vijji | 























# @Tc_Register_002
#Scenario: Unsuccessful Registration
#    Given user opens Chromebrowser and enter url as "https://www.snapdeal.com"
#    Then click on Signin
#    And click on Register
#    Then enter mobilenumber/email
#    | email |
#    | vijayagolla324@gmail.com |
#    And Click on Continue
#   Then User enters mobilenumber, Name and password  
#   | mobilenumber | name | password |
#   | 8008789565 | Vijaya Lakshmi Golla | vijji | 
#    And  User clicks on Continue
#
#  