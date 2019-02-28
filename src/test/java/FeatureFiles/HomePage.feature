Feature: Verify Home page

  Scenario: Verify whether user is able to search an item
    Given I want to open browser "Chrome"
    And I want to launch the application "https://www.amazon.in/"
    And I want to enter to text box "//input[@id='twotabsearchtextbox']" and a value is "camera"
    Then I want to click on "//input[@value='Go']" text box
    And I want to close the application
    
  Scenario: Get a text value
  	Given I want to open browser "Chrome"
    And I want to launch the application "https://www.amazon.in/"
    And I want to click on "//*[text()='Amazon Pay']" text box
    And I want to get a text value "//span[@class='a-size-base-plus a-color-success']"
  And I want to close the application
    
    