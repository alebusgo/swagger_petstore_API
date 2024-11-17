Feature: Delete User

  Background:
    * url apiUrl

  @regression
  Scenario: User Deleted Successfully
    * def createUser = call read('classpath:features/regression/user/createUser/createUserRegression.feature')
    * def newUserName = createUser.newBody.username
    Given path 'api/v3/user' ,newUserName
    When method DELETE
    Then status 200


