@calc1 
Feature: Calculator 
	As an user
	I want to add two numbers
	So that to view the result

@add2num 
Scenario: Add two numbers 
	Given I am at calculator page 
	When I pass these values	
		| a | b	|
		| 3 | 2	|
		| 8 | 5	|
		| 8.3 | 5	|