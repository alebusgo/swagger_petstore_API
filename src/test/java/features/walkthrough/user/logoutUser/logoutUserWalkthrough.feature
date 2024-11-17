Feature: Logout User

  Background:
    * url apiUrl

  @walkthrough
  Scenario: User logged out Successfully

    Given path '/api/v3/user/logout'
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.txt')


