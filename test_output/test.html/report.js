$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/TagsFeatureOptionTesting.feature");
formatter.feature({
  "line": 2,
  "name": "FreeCRM site testing",
  "description": "",
  "id": "freecrm-site-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify FreeCRM site using valid credentials",
  "description": "",
  "id": "freecrm-site-testing;verify-freecrm-site-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "FreeCRM Application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User entered valid username and Valid password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicked on Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "CRMPRO page is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Verify FreeCRM site using InValid credentials",
  "description": "",
  "id": "freecrm-site-testing;verify-freecrm-site-using-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "FreeCRM Application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User entered Invalid username and InValid password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "CRMPRO page should not be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Create a contact",
  "description": "",
  "id": "freecrm-site-testing;create-a-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SmokeTest"
    },
    {
      "line": 19,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "This is a contact test case",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Create a deal",
  "description": "",
  "id": "freecrm-site-testing;create-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "This is a deal test case",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 28,
  "name": "Create a tasks",
  "description": "",
  "id": "freecrm-site-testing;create-a-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "This is a tasks test case",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 32,
  "name": "Create a case",
  "description": "",
  "id": "freecrm-site-testing;create-a-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    },
    {
      "line": 31,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "This is a case test case",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 35,
  "name": "Verify left panel links",
  "description": "",
  "id": "freecrm-site-testing;verify-left-panel-links",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "clicking on left panel links",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 38,
  "name": "Search a deal",
  "description": "",
  "id": "freecrm-site-testing;search-a-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "This is a search deal test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 41,
  "name": "Search a contact",
  "description": "",
  "id": "freecrm-site-testing;search-a-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "This is a search contact test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 44,
  "name": "Search a case",
  "description": "",
  "id": "freecrm-site-testing;search-a-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "This is a search case test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 47,
  "name": "Search a task",
  "description": "",
  "id": "freecrm-site-testing;search-a-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "This is a search task test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 50,
  "name": "Search an email",
  "description": "",
  "id": "freecrm-site-testing;search-an-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "This is a search email test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 53,
  "name": "Search a docs",
  "description": "",
  "id": "freecrm-site-testing;search-a-docs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 54,
  "name": "This is a search docs test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 56,
  "name": "Search a forms",
  "description": "",
  "id": "freecrm-site-testing;search-a-forms",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 57,
  "name": "This is a search forms test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 59,
  "name": "validate a report",
  "description": "",
  "id": "freecrm-site-testing;validate-a-report",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 60,
  "name": "This is a report test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 62,
  "name": "Application Logout",
  "description": "",
  "id": "freecrm-site-testing;application-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 63,
  "name": "This is a logout test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 65,
  "name": "browser closed",
  "description": "",
  "id": "freecrm-site-testing;browser-closed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "This is a close broswer test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});