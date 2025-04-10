Feature: User Login Function

#Scenario Outline: Validate Login Admin
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then should display sucess message

#Examples:
#	|username| password|
#	|tomtomsmith | SuperSecretPassword! | 
#	|tomtomsmith1 | SuperSecretPassword! | 
#	|tomtomsmith | SuperSecretPassword | 



Scenario: Validate Login Admin
Given User is on Login Page
When User enters credentials
	|username| password|
	|tomsmith  | SuperSecretPassword! | 
Then should display sucess message
	| You logged into a secure area! |