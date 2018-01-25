
Feature:GCR Site validation
Scenario:GCR validating Login details
Given GCR Site is already launched
Then  User enter "admin"and "admin@123"
Then  User clicked on Login button
Then  Verify whether is landed in Home page as expected
Then user clicked on LogOut link
Then user closed the browser
