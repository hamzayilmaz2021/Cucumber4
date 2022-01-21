Feature: US_053	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 10. stepte en az 5 en fazla 10 tane resim ekleyebilmeliyim.
  Background: login
    Given user goes to "http://test.kese.nl/login" page
    And user types "hamza@gmail.com" to the email input with "ValidEmail" on the login page
    And user types "1234" to the password input on the login page
    And user clicks to the giris yap button one the login page
    And user goes to "http://test.kese.nl/new_home" page
    And user chooses house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And user clicks to the checkbox on the new home step two page
    And user clicks to the ilerle button on the new home page
    And user types usage area as "120" to the input on the new home step three page
    And user clicks on the increment buttons on the new home step three page
    And user clicks to the ilerle button on the new home page
    And user clicks on the increment button of tek kisilik yatak on the new home step four page
    And user clicks to the ilerle button on the new home page
    And user clicks on the tv option on the new home step five page
    And user clicks to the ilerle button on the new home page
    And user types a description as "Merhabalar" to the input on the new home step six page
    And user clicks to the ilerle button on the new home page
    And user clicks to the lunapark on the new home step seven page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all hayir options on the new home step eight page
    And user clicks to the ilerle button on the new home page
    And user chooses the date on the new home step nine page
    And user clicks to the ilerle button on the new home page

  Scenario: TC_001_US_053_i should be able to add up to ten photos
    Then user uploads ten photos on the new home step en page

  Scenario: TC_002_US_053_i should be able to add at least five photos
    Then user uploads five photos on the new home step en page

  Scenario: TC_003_US_053_ "Resimleri Kaydet" button should be clickable after adding five photos
    And user uploads five photos on the new home step en page
    Then user verifies the resimleri kaydet button is clickable

