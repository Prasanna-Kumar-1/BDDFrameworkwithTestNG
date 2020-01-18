$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "Allianz Application Login Test",
  "description": "Description: To Test the Login Functionality of Allianz Application",
  "id": "allianz-application-login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AlliznzLoginTest"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#normal login - Using UserName and Password from the Property File"
    },
    {
      "line": 6,
      "value": "#smokeTest"
    }
  ],
  "line": 7,
  "name": "Allianz Application Login Test",
  "description": "",
  "id": "allianz-application-login-test;allianz-application-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is already on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the title of the login page is Allianz Login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters \"pktest001\" and \"test001\" and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_is_already_on_the_Login_Page()"
});
formatter.result({
  "duration": 11200389500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.the_title_of_the_login_page_is_Allianz_Login()"
});
formatter.result({
  "duration": 94289400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pktest001",
      "offset": 13
    },
    {
      "val": "test001",
      "offset": 29
    }
  ],
  "location": "LoginPageTest.user_enters_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 505962500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_is_on_the_Home_Page()"
});
formatter.result({
  "duration": 13269700,
  "error_message": "java.lang.AssertionError: expected [allianz.com.au - My Portfolio] but found [Error]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat com.qa.StepDefinitions.LoginPageTest.user_is_on_the_Home_Page(LoginPageTest.java:47)\r\n\tat ✽.Then User is on the Home Page(LoginPage.feature:11)\r\n",
  "status": "failed"
});
});