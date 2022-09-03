@ui @db
Feature: Add new student
  @add_student
  Scenario: Add new student and verify status code 201
    Given User logged in to Bookit api as teacher role
    When Users sends POST request to "/api/students/student" with following info:
      | first-name      | miho              |
      | last-name       | fitch               |
      | email           | haroldEmai6487875@gmail.com  |
      | password        | abc123              |
      | role            | student-team-leader |
      | campus-location | VA                  |
      | batch-number    | 8                   |
      | team-name       | Nukes               |
    Then status code should be 201
    And Database should contain same student info
    And User should able to login bookit app on ui
    And User deletes previously created student
