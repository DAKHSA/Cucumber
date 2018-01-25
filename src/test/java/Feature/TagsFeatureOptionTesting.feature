@FunctionalTest
Feature:FreeCRM site testing 

@SmokeTest @RegressionTest
Scenario:Verify FreeCRM site using valid credentials
Given FreeCRM Application is launched
When User entered valid username and Valid password
When User clicked on Login Button
Then CRMPRO page is displayed

@RegressionTest
Scenario:Verify FreeCRM site using InValid credentials
Given FreeCRM Application is launched
When User entered Invalid username and InValid password
When User clicks on Login Button
Then CRMPRO page should not be displayed


@SmokeTest @RegressionTest
Scenario: Create a contact
Given This is a contact test case

@RegressionTest
Scenario: Create a deal
Given This is a deal test case

@SmokeTest
Scenario: Create a tasks
Given This is a tasks test case

@SmokeTest @RegressionTest
Scenario: Create a case
Given This is a case test case

Scenario: Verify left panel links
Given clicking on left panel links

Scenario: Search a deal
Given This is a search deal test

Scenario: Search a contact
Given This is a search contact test

Scenario: Search a case
Given This is a search case test

Scenario: Search a task
Given This is a search task test

Scenario: Search an email
Given This is a search email test

Scenario: Search a docs
Given This is a search docs test

Scenario: Search a forms
Given This is a search forms test

Scenario: validate a report
Given This is a report test

Scenario: Application Logout
Given This is a logout test

Scenario: browser closed
Given This is a close broswer test

