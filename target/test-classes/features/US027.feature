@ui
Feature: US_027	Bir kullanıcı olarak "/signup" sayfasına girdiğimde, sisteme kayıt olabilmeli ve oluşturduğum kayıt ile sisteme giriş yapabilmeliyim.
  @smoketest
  Scenario: TC_001_US_027 I should be able to login with the data used for registration.
    Given user goes to "https://kese.nl/signup" page
    And user types "kalem" to the username input on the signup page
    And user types "kalem@gmail.com" to the email input on the signup page
    And user types "1234" to the password input on the signup page
    And user types "1234" to the repassword input on the signup page
    And user clicks to the checkbox on signup page
    And user clicks to the kayit ol button on the signup page
    And user types "kalem@gmail.com" to the email input with "RandomNumber" on the login page
    And user types "1234" to the password input on the login page
    And user clicks to the giris yap button one the login page
    Then user verifies the page url is "https://kese.nl/"
