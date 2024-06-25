Feature: Login Page Automation for sauceDemo App

  Scenario Outline: Check Login is succesfully with valid credentials
    Given User is on login page
    When user enters Valid <username> and <password>
    And Clicks on login button
    Then User is navigated to home page
    And Close the browser

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      
