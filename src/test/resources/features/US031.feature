Feature: US_031	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.

  #"Ev Tipi" başlığı görünür olmalıdır.
  #"Değişim yapmak istediğiniz evinizin türünü belirtiniz" açıklaması görünür olmalıdır.
  #"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri görünür olmalıdır.
  #"Müstakil Ev", "Apartman Dairesi" ve "Stüdyo Daire"  seçenekleri seçilebilir olmalıdır.
  #1. stepte, sayfanın üst kısmında "1 / 10" yazısı görünür olmalıdır.

  Background: login
    Given user goes to "http://test.kese.nl/login" page
    And user types "hamza@gmail.com" to the email input with "ValidEmail" on the login page
    And user types "1234" to the password input on the login page
    And user clicks to the giris yap button one the login page
    And user goes to "http://test.kese.nl/new_home" page

  Scenario Outline:
    Given user verifies "Ev Tipi" is visible
    And user verifies "Değişim yapmak istediğiniz evinizin türünü belirtiniz" is visible
    And user verifies "<ev tipi>" is visible
    And user verifies step status is "1 / 10"
    And user chooses "<ev tipi>" as house type on the new home step one page
    And user verifies "<ev tipi>" is selected on the new home step one page
    Examples:
      | ev tipi          |
      | Müstakil Ev      |
      | Apartman Dairesi |
      | Stüdyo Daire     |