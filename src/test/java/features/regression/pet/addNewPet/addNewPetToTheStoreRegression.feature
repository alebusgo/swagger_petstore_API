Feature: Add New Pet To The Store

  Background:
    * url apiUrl

  @regression
  Scenario: New Pet Added to the Store Successfully
    * def randomNumber = function(max) {return Math.floor(Math.random() * max)}
    * def temp = randomNumber(99999)
    * json newBody = read('body.json')
    * set newBody.id = temp
    Given path '/api/v3/pet'
    And request newBody
    When method POST
    Then status 200
    And print 'Response: ',response
    And match response == read('addNewPetExpectedResponse.json')


