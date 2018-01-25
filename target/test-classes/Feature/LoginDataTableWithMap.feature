Feature:GCR Site Testing 
Scenario: GCR Login validation with valid username and password using DataTable with Map
Given Application GCR Site is launched successfully.
When Entering username and password

|username|password|
|admin|admin@123|

When  Clicking Login button
Then  Check Home page is displayed 
Then  GCR site is loggedOff
Then  browser should be closed
