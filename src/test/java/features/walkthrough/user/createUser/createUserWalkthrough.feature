Feature: Create User

  Background:
    * url apiUrl

  @walkthrough
  Scenario: User Created Successfully
    * def randomNumber = function(max) {return Math.floor(Math.random() * max)}
    * def temp = randomNumber(99999)
    * json newBody = read('body.json')
    * set newBody.id = temp
    Given path 'api/v3/user'
    And request newBody
    When method POST
    Then status 200
    And print 'Response: ',response
    And match response == read('createUserExpectedResponse.json')


