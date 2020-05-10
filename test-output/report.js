$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Test1.feature");
formatter.feature({
  "name": "This is to test something",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test negative scenario is transfer fund",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have an account with zero balance",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I try to transfer 50$",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I see an error",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/java/Features/Test2.feature");
formatter.feature({
  "name": "This is to test gmail login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify gmail login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch the firefox driver",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Gmail_login.i_launch_the_firefox_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my credentials and click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Gmail_login.i_enter_my_credentials_and_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Gmail_login.i_land_on_home_page()"
});
formatter.result({
  "status": "passed"
});
});