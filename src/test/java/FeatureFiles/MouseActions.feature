@tag
Feature: Title of your feature
  
  @tag1
  Scenario Outline: Title of your scenario outline
    Given I want to open browser "<browser>"
    Then I want to launch application "<url>"
	  And I want to mouse hover to the element   
 #   And I want to close the application

    Examples: 
      | browser  | url 									 | 
      | Chrome 	 | https://www.ebay.com/ |
      | IE 	 		 | https://www.ebay.com/ |  
    
