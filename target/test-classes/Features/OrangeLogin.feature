
@tag
Feature: validate the login functionality of Orange

  @tag1
  Scenario: validate the login functionality of Orange with valid credentials
    Given launch the browser
    And open the orange application
    When enter the username and password
    And click the login button
    Then I validate the outcomes
    And close the browser

 

  
    
   