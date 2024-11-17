Feature: Updates A Pet In The Store With Form Data

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Pet Updated With Form Data Successfully
     * def query = {username: 'theUser', password:'12345'}
    Given path '/api/v3/user/login/'
    And params query
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.txt')


