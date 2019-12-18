Feature: my validation for the parameterization of login xx
@Sanity
Scenario: validation for registeration in demoweb xx
Given demoweb website is launchedxx
And user clicks on sign up xx 
When user enters proper data required for the registeration xx
Then clicks on submit button to create his account xx
@Regression
Scenario Outline: validation for login in demoweb xx
Given demoweb is launched xx
Then he provides registered valid username xx "<uname>"
And he provides valid password in the field xx "<pswrd>"
Then he verifies the login xx

Examples:
|uname   |pswrd   |
|ashlesha|gawai1      |
|sangita |passw123   |
|amey    |password234|