$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "IE QA Login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Test to be performed for agent3 credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Chrome browser to be launched",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.chrome_browser_to_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "IE UAT URL to be opened \"https://uat.life.eApp.clearview.com.au/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.ie_UAT_URL_to_be_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username as \"UAT_ProdSupportUser\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password as \"Jota7902\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home Page Title to be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Minimize the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.minimize_the_browser()"
});
formatter.result({
  "status": "passed"
});
});