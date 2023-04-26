Feature: Products

  Scenario : GET - Periksa API Semua Product dengan valid data
    Given I set GET valid endpoint
    When I send GET HTTP request from product
    Then I receive valid status code 200 OK
    And I receive valid data all product

#  Scenario : GET - Periksa API Semua Product dengan invalid data
#    Given I set GET invalid endpoint
#    When I send invalid GET HTTP request from product
#    Then I receive invalid HTTP response code 404 Not Found
#    And I receive invalid data all product

