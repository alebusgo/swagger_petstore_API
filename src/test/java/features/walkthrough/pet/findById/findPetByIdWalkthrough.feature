Feature: Find Pet By Id

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Pet Found By Id Successfully
    * def addNewPet = call read('classpath:features/walkthrough/pet/addNewPet/addNewPetToTheStoreWalkthrough.feature')
    * def newId = addNewPet.newBody.id
    Given path '/api/v3/pet/' ,newId
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')


