$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/GETFlights.feature");
formatter.feature({
  "name": "FLIGHTS SEARCHING FROM DELHI",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, I want to search flights from Delhi, so that I can book flights",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a request URL \"https://voyager.goibibo.com/api/v2/flights_search/find_node_by_name_v2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_have_a_request_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request \"https://voyager.goibibo.com/api/v2/flights_search/find_node_by_name_v2\" with endpiont \"/?search_query\u003dDEL\u0026limit\u003d15\u0026v\u003d2\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_send_request_with_endpiont(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_see_response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the response",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_get_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the value at \"data.r.n[0]\" is \"Delhi Airport\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_verify_the_value_at_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the value at \"data.r.iata[0]\" is \"DEL\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_verify_the_value_at_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/PostCall.feature");
formatter.feature({
  "name": "Sample post call",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, I want to do a sample post call",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a request URL \"https://jsonplaceholder.typicode.com/users\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_have_a_request_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send POST request \"https://jsonplaceholder.typicode.com/users\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.POSTCall.i_send_POST_request(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see response code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_see_response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the response",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_get_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the value at \"0.name\" is \"Krishna Rungta\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_verify_the_value_at_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the value at \"0.address.city\" is \"Gwenborough\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FlightSearch.i_verify_the_value_at_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});