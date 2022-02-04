Feature: US_082	Bir kullanıcı olarak "/api/user/account" sayfasına "post" tipinde bağlandığımda gönderdiğim bilgiler ile kullanıcı oluşturulmalıdır.

  Scenario: TC_001_US_082_positive
    Given user connects to "/user/account" with post
    Then user verifies the response includes the sonuc property

  Scenario: TC_002_US_082_negative1
    Given user connects to "/user/account" with post negative one
    Then user verifies the value of sonuc property is "email" negative one

  Scenario: TC_003_US_082_negative2
    Given user connects to "/user/account" with post negative two
    Then user verifies the value of sonuc property is "hata" negative two

