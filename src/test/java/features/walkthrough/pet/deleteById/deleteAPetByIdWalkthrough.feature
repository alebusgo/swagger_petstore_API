Feature: Delete A Pet By Id

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Pet Deleted Successfully
    * def addNewPet = call read('classpath:features/walkthrough/pet/addNewPet/addNewPetToTheStoreWalkthrough.feature')
    * def newId = addNewPet.newBody.id
    * json newBody = read('body.json')
    * set newBody.id = newId
    Given path '/api/v3/pet/', newId
    When method DELETE
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.txt')


