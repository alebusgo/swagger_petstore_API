Feature: Returns Pet Inventory By Status

  Background:
    * url apiUrl

  @regression
  Scenario: Pet Inventory Returned By Status Successfully
    Given path 'api/v3/store/inventory'
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')