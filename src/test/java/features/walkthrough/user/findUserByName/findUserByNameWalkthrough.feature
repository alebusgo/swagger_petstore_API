Feature: Find User By Name

  Background:
    * url apiUrl

  @walkthrough
  Scenario: User Found By Name Successfully
    * def createUser = call read('classpath:features/walkthrough/user/createUser/createUserWalkthrough.feature')
    * def newUserName = createUser.newBody.username
    Given path 'api/v3/user' ,newUserName
    When method GET
    Then status 200


