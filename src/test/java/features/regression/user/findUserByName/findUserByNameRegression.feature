Feature: Find User By Name

  Background:
    * url apiUrl

  @regression
  Scenario: User Found By Name Successfully
    * def createUser = call read('classpath:features/regression/user/createUser/createUserRegression.feature')
    * def newUserName = createUser.newBody.username
    Given path 'api/v3/user' ,newUserName
    When method GET
    Then status 200


