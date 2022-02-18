Feature: US175

  Scenario:
    Given user connects to the database
    And user gets the yetkili list
    Then user verifies reference count of the all yetkili users is greater than or equal to two