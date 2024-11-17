Feature: Updates A Pet In The Store With Form Data

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Pet Updated With Form Data Successfully
    * def addNewPet = call read('classpath:features/regression/pet/addNewPet/addNewPetToTheStoreRegression.feature')
    * def newId = addNewPet.newBody.id
    * def query = {name: 'newName', status:'newStatus'}
    Given path '/api/v3/pet/', newId
    And params query
    When method POST
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')


