Feature: Place An Order For A Pet

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Order For A Pet Placed Successfully
    * def randomNumber = function(max) {return Math.floor(Math.random() * max)}
    * def temp = randomNumber(99999)
    * json newBody = read('body.json')
    * set newBody.id = temp
    Given path 'api/v3/store/order'
    And request newBody
    When method POST
    Then status 200
    And print 'Response: ',response
    And match response == read('placeOrderExpectedResponse.json')


