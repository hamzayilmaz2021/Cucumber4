Feature: US_032	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.
  # "İlerle" butonu görünür olmalıdır.
  #  "İlerle" butonu default olarak tıklanabilir olmamalıdır.
  #  Herhangi bir ev tipi seçili olmadığında, İlerle butonuna tıklanırsa "Lütfen ev tipini seçiniz" uyarısı görünür olmalıdır.
  #  Herhangi bir ev tipi seçildiğinde, İlerle butonu tıklanabilir olmalı.

  Background: login
    Given user goes to "http://test.kese.nl/login" page
    And user types "hamza@gmail.com" to the email input with "ValidEmail" on the login page
    And user types "1234" to the password input on the login page
    And user clicks to the giris yap button one the login page
    And user goes to "http://test.kese.nl/new_home" page

  Scenario Outline:
    And user verifies "İlerle" is visible
    And user clicks to the ilerle button on the new home page
    And user verifies step status is "1 / 10"
    And user verifies "Lütfen ev tipini seçiniz" is visible
    And user chooses "<ev tipi>" as house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user verifies step status is "2 / 10"
    Examples:
      | ev tipi          |
      | Müstakil Ev      |
      | Apartman Dairesi |
      | Stüdyo Daire     |



