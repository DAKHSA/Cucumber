Feature:GCR Site Testing 
Scenario:GCR Login validation with valid username and password using DataTable with list
Given GCR Site is launched successfully.
When User entered username and password
|admin|admin@123|
When User clicked Login button
Then Home page is displayed 
Then User loggOff for the site
Then close the browser