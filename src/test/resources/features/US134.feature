Feature:

  Background: login
    Given user goes to "https://kese.nl/login" page
    And user types "kullanici1@gmail.com" to the email input with "ValidEmail" on the login page
    And user types "1234" to the password input on the login page
    And user clicks to the giris yap button one the login page
    And user goes to "https://kese.nl/new_car" page

  Scenario:
    Given user goes to the fifth step on the new car page
    And user verifies the ilerle button is visible on the new car page
    And user clicks to the ilerle button on the new car page
    And user verifies "Lütfen tarih ve saat bilgisi seçiniz." is visible
    And user chooses date and time on the new car page
    And user clicks to the ilerle button on the new car page
    And user verifies "Araç Fotoları" is visible

