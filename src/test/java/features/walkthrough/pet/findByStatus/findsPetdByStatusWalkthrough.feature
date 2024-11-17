Feature: Finds Pets By Status

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Pets Found By Status Successfully
    * def query = {status:'available'}
    Given path '/api/v3/pet/findByStatus'
    And params query
    When method GET
    Then status 200
    And print 'Response: ',response[0]
    And match response[0] == read('expectedResponse.json')