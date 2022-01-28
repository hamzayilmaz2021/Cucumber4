Feature: Deneme API - Kullanıcı Bilgileri

  Scenario: kullanici bilgilerini alir
    Given user connects to "/user/account"
    Then user verifies the status code is 200
    Then user verifies the response includes the proterties