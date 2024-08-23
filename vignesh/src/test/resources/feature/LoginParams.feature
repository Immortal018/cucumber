@tag
Feature: Title of your feature

  @tag2
  Scenario Outline: Successful login with several login credentials
    Given User Launch Chrome browser
    When User opens URL "https://tutorialsninja.com/demo/"
    And user enters the "<email>" and "<password>"
    And user clicks on login button
    Then user navigated to homepage
    And user clicks on logout

    Examples: 
      | email           | password |
      | vign@gmail.com  | vign     |
      | vignn@gmial.com | negj     |
      | neph@gmail.com  | vignesh  |
