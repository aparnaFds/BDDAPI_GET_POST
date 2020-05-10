Feature: Sample post call

Scenario: As a user, I want to do a sample post call

	Given I have a request URL "https://jsonplaceholder.typicode.com/users" 
	When I send POST request "https://jsonplaceholder.typicode.com/users" 
	Then I see response code 201 
	And I get the response 
	#And I verify the value of param is "Delhi Airport" of "data.r.n[0]"
	And I verify the value at "0.name" is "Krishna Rungta" 
	And I verify the value at "0.address.city" is "Gwenborough" 
	
