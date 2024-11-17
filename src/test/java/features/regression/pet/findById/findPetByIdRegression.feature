Feature: Find Pet By Id

  Background:
    * url apiUrl

  @regression
  Scenario: Pet Found By Id Successfully
    * def addNewPet = call read('classpath:features/regression/pet/addNewPet/addNewPetToTheStoreRegression.feature')
    * def newId = addNewPet.newBody.id
    Given path '/api/v3/pet/' ,newId
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')


