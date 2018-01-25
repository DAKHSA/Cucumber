Feature:GCR Site validation with parameterisation using data driven wo example
Scenario Outline:GCR validating Login details using data driven wo example
Given User is already launched application
Then  Enter "<u_name>" and "<p_word>"
Then  Click on Login button
Then  Verify Home page is displayed as expected
Then  Click on LogOut link
Then  Close the Browser 

Examples:
|	u_name		|	p_word|
|	admin			|	admin@123|
|	admin			|	admin@123|
