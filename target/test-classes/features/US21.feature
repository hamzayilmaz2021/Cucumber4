Feature: US_021	Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kullanıcı kaydı oluşturmak için aynı şifreyi 2 kez girmeliyim.

  @smoketest
  Scenario: TC_001_US_021 and TC_002_US_021
    Given user goes to "http://test.kese.nl/signup" page
    And user types "hamza" to the username input on the signup page
    And user types "hamza@gmail.com" to the email input on the signup page
    And user types "1234" to the password input on the signup page
    And user types "12345678" to the repassword input on the signup page
    And user clicks to the checkbox on signup page
    And user clicks to the kayit ol button on the signup page
    Then user verifies "Şifreler birbiri ile uyuşmuyor." is visible
    And user types "1234" to the password input on the signup page
    And user types "1234" to the repassword input on the signup page
    And user clicks to the kayit ol button on the signup page
    Then user verifies "Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz." is visible



 #  Scenario Outline: TC_001_US_021 and TC_002_US_021
 #    Given user goes to "http://test.kese.nl/signup" page
 #    And user types "hamza" to the username input on the signup page
 #    And user types "hamza@gmail.com" to the email input on the signup page
 #    And user types "<sifre>" to the password input on the signup page
 #    And user types "<sifreTekrar>" to the repassword input on the signup page
 #    And user clicks to the checkbox on signup page
 #    And user clicks to the kayit ol button on the signup page
 #    Then user verifies "<uyari>" is visible
 #    Examples:
 #      | sifre | sifreTekrar | uyari                                                             |
 #      | 1234  | 1234        | Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz. |
 #      | 1234  | 12345678    | Şifreler birbiri ile uyuşmuyor.                                   |



  #  Scenario: TC_001_US_021	"Şifre" and "Şifre Tekrarı" should be same when registering
  #    Given user goes to "http://test.kese.nl/signup" page
  #    And user types "hamza" to the username input on the signup page
  #    And user types "hamza@gmail.com" to the email input on the signup page
  #    And user types "1234" to the password input on the signup page
  #    And user types "1234" to the repassword input on the signup page
  #    And user clicks to the checkbox on signup page
  #    And user clicks to the kayit ol button on the signup page
  #    Then user verifies "Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz." is visible
  #
  #  Scenario: TC_002_US_021	If the values of "Şifre" and "Şifre Tekrarı" inputs are not same, "Şifreler birbiri ile uyuşmuyor." should be visible.
  #    Given user goes to "http://test.kese.nl/signup" page
  #    And user types "hamza" to the username input on the signup page
  #    And user types "hamza@gmail.com" to the email input on the signup page
  #    And user types "1234" to the password input on the signup page
  #    And user types "12345678" to the repassword input on the signup page
  #    And user clicks to the checkbox on signup page
  #    And user clicks to the kayit ol button on the signup page
  #    Then user verifies "Şifreler birbiri ile uyuşmuyor." is visible