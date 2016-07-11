#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Transfer Amount from one account to another

@tag1
Scenario: Transfer_Positive
Given I succesfully logged into my account
	And I am provided with your account details
	And Balance in my account $5 greater than minimum balance
When I initiate a transfer of $5 to your account
Then The transaction has to succeed
	And My balance has to be reduced by $5
	
	Scenario: Transfer_Negative
Given I succesfully logged into my account
	And I am provided with your account details
	And Balance in my account less than or equal to minimum balance
When I initiate a transfer of $5 to your account
Then The transaction has to fail
	And My balance has to remain same
	And I have to be notified that there is no sufficient balance in my account.




