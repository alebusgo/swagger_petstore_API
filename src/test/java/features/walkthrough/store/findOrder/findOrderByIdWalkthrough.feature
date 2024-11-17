Feature: Find Order By Id

  Background:
    * url apiUrl

  @walkthrough
  Scenario: Order Found By Id Successfully
    * def placeNewOrder = call read('classpath:features/walkthrough/store/placeOrder/placeOrderFoAPetWalkthrough.feature')
    * def newOrderId = placeNewOrder.newBody.id
    Given path 'api/v3/store/order' ,newOrderId
    When method GET
    Then status 200
    And print 'Response: ',response
    And match response == read('expectedResponse.json')


