@Endtoend
Feature: Buying product

@TC_Search_001
Scenario: Buying  a product from search bar
  Given User open the Chrome browser  and enter URL as "https://www.snapdeal.com\"
  Then Click on searchicon
  And enter  "Home & Kitchen" for Search
  Then Click on Search button
  Then Select a product
  Then  that product add to cart
  And Click on proceed to payment
  Then enter username,password and click on continue
  And enter delivery address
  Then click on proceed payment
  And click on cash on delivery 

@TC_Trending_001
Scenario: Buying  a product from trending products
  Given User open the Chrome browser  and enter URL as "https://www.snapdeal.com\"
  Then Click on product from trending products
  And  select the product
  Then product add to cart
  And Click on proceed to payment
  Then enter username,password and click on continue
  And enter delivery address
  Then click on proceed payment
  And click on net banking 
  Then select card type
