Feature: my validation on demoweb 
@Sanity
Scenario: registeration of the user
Given demoweb website is launched
And user clicks on register 
When user enters data
Then clicks on submit button

@Regression
Scenario: user access to login after registering
Given user clicks on sign in
Then he enters credentials
And clicks on submit button

@Smoke
Scenario: user wants to search an item
Given user searches the desired item
Then selects the desired item 

Scenario: user adds to the cart
Given user adds the desired item to the cart
Then he selects the payment method
And he makes the payment