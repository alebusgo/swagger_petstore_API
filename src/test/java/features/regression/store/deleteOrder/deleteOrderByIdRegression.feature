Feature: Delete Order By Id

  Background:
    * url apiUrl

  @regression
  Scenario: Order Deleted By Id Successfully
    * def placeNewOrder = call read('classpath:features/regression/store/placeOrder/placeOrderFoAPetRegression.feature')
    * def newOrderId = placeNewOrder.newBody.id
    Given path 'api/v3/store/order' ,newOrderId
    When method DELETE
    Then status 200


