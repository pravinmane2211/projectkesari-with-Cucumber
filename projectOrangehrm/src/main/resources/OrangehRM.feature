@ab 
Feature: Login Action 
Scenario Outline: Successful Login with Valid Credentials 
	Given User is on Home Page "https://opensource-demo.orangehrmlive.com/" 
	When User Navigate to LogIn Page 
	And User enters username "<username>" and password "<password>" 
	Then Message displayed Login Successfully 
	Then Wait for some time
	Then User click on logout
	Examples: 
		| username   | password |result|
		| Admin      | admin123 |valid |
		

 Scenario Outline:Login with InValid Credentials 
 Given User is on Home Page "https://opensource-demo.orangehrmlive.com/" 
 When User Navigate to LogIn Page 
	And User enters username "<username>" and password "<password>" 
	But Message displayed Login UnSuccessfully
	Then user is on home "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"
	Then Wait for some time
	Then scren shot of this page
	Examples: 
		| username   | password |result  |
		| parvin     | admin123 |Invalid |
		