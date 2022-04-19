Feature: login


  @positive
  Scenario: Success POST login
    When user send POST success login request to reqresin
    Then Status response code should be 200
    And Response body should be matched with "login.json"

  @negative
  Scenario: Unsuccess POST login
    When user send POST unsuccess login request to reqresin
    Then Status response code should be 400
    And Response body should be matched with "unsuccess-login.json"