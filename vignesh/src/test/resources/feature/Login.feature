Feature: Login

Scenario: Successful Login with Valid Credentials
Given User Launch Chrome browser
When User opens URL "https://tutorialsninja.com/demo/"
And User enters "neph@gmail.com" and "vignesh"
And user clicks on login button
Then user navigated to homepage
And  user clicks on logout