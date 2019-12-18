Feature: my validation on icici bank
@Sanity @Regression
Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on sign up button 
When user enters proper data
Then clicks on submit button for account creation
@Regression
Scenario: user access to login for registered Member
Given registered user clicks on signIn link
Then he provides valid data for login input fields
And clicks on submit button for the login validation
@Smoke
Scenario: user access to book flight
Given user verifies the flight available
Then selects the desired flight
When user makes the payment
Then tickets are generated