Feature: Delete User

  Background:
    * url apiUrl

  @walkthrough
  Scenario: User Deleted Successfully
    * def createUser = call read('classpath:features/walkthrough/user/createUser/createUserWalkthrough.feature')
    * def newUserName = createUser.newBody.username
    Given path 'api/v3/user' ,newUserName
    When method DELETE
    Then status 200


