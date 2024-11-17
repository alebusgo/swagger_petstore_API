Feature: Update User

  Background:
    * url apiUrl

  @regression
  Scenario: User Updated Successfully
    * def createUser = call read('classpath:features/walkthrough/user/createUser/createUserWalkthrough.feature')
    * def newUserName = createUser.newBody.username
    * json newBody = read('body.json')
    * set newBody.username = newUserName
    Given path 'api/v3/user' ,newUserName
    And request newBody
    When method PUT
    Then status 200
    And print 'Response: ', response
    And match response == read('expectedResponse.json')


