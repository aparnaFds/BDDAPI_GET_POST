Feature: FLIGHTS SEARCHING FROM DELHI 

Scenario: As a user, I want to search flights from Delhi, so that I can book flights 

	Given I have a request URL "https://voyager.goibibo.com/api/v2/flights_search/find_node_by_name_v2" 
	When I send request "https://voyager.goibibo.com/api/v2/flights_search/find_node_by_name_v2" with endpiont "/?search_query=DEL&limit=15&v=2"
	Then I see response code 200 
	And I get the response 
	#And I verify the value of param is "Delhi Airport" of "data.r.n[0]"
	And I verify the value at "data.r.n[0]" is "Delhi Airport" 
	And I verify the value at "data.r.iata[0]" is "DEL" 
	
