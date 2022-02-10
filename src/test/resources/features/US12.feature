@ui
Feature: US_12 Bir kullanıcı olarak "/login" sayfasına girdiğimde, şifremi unuttum bölümüne ulaşabilmeliyim
  Background:
    Given user goes to "https://kese.nl/login" page

  Scenario: TC_001_US_012 sifremi unuttum should be visible and enabled
    Then user asserts sifremi unuttum is visible and enabled

  Scenario: TC_002_US_012 sifremi unuttum should be underlined
    Then user asserts sifremi unuttum is underlined

  Scenario: TC_003_US_012 sifremi unuttum should redirect to the "http://test.kese.nl/forgot_password"
    Given user clicks to the sifremi unuttum
    Then user asserts sifremi unuttum should redirect to the "https://kese.nl/forgot_password"




