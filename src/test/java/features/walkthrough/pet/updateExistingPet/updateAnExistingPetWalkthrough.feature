Feature: Add New Pet To The Store

  Background:
    * url apiUrl

  @walkthrough
  Scenario: New Pet Added to the Store Successfully
    * def addNewPet = call read('classpath:features/walkthrough/pet/addNewPet/addNewPetToTheStoreWalkthrough.feature')
    * def newId = addNewPet.newBody.id
    * json newBody = read('body.json')
    * set newBody.id = newId
    Given path '/api/v3/pet'
    And request newBody
    When method PUT
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')


