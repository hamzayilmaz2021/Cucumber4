Feature: US_022	Bir kullanıcı olarak "/forgot_password" sayfasına girdiğimde, email adresime şifre sıfırlama linki gönderebilmeliyim.

  Background:
    Given user goes to "http://test.kese.nl/forgot_password" page

  Scenario Outline: TC_001_US_022 and TC_002_US_022
    And user types "<email>" to the email input on the forgot password page
    And user clicks to the sifremi degistir button on the forgot password page
    Then user verifies "<text>" is visible
    Examples:
      | email                     | text                                                        |
      | kullanici1@gmail.com      | Girmiş olduğunuz email adresine sıfırlama linki gönderildi. |
      | hamzayilmaz1999@gmail.com | Böyle bir kullanıcı bulunamadı                              |


  #Scenario: TC_001_US_022 Girmiş olduğunuz email adresine sıfırlama linki gönderildi should be visible.
  #  And user types "kullanici1@gmail.com" to the email input on the forgot password page
  #  And user clicks to the sifremi degistir button on the forgot password page
  #  Then user verifies "Girmiş olduğunuz email adresine sıfırlama linki gönderildi." is visible

  #Scenario: TC_002_US_022 Böyle bir kullanıcı bulunamadı should be visible
  #  And user types "hamzayilmaz1999@gmail.com" to the email input on the forgot password page
  #  And user clicks to the sifremi degistir button on the forgot password page
  #  Then user verifies "Böyle bir kullanıcı bulunamadı" is visible

