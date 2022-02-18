@ui
Feature: US_007	Bir kullanıcı olarak ana sayfaya girdiğimde, "Popüler İlanlar" bölümünü görebilmeliyim.
  mvn test -Dcucumber.options="--tags @smoke"
  Background:
    Given user goes to "https://kese.nl" page

  Scenario: TC_001_US_007	"Popüler İlanlar" should be visible.
    Then user verifies "Popüler İlanlar" is visible

  Scenario: TC_002_US_007 "Ev Değişimi", "Oda Kirala" and "Bed & Breakfast" should be located.
    Then user verifies popular posts section titles are visible

  Scenario: TC_003_US_007	"Ev Değişimi", "Oda Kirala" and "Bed & Breakfast" should be clickable.
    Then user verifies popular posts section titles are clickable

  Scenario Outline: TC_004_US_007	"Ev Değişimi", "Oda Kirala" and "Bed & Breakfast" should contain only its own posts.
    And user clicks to the "<type>" button in popular posts section
    Then user verifies "<type>" posts contain "<url>" text in url
    Examples:
      | type            | url            |
      | Ev Değişimi     | /home/         |
      | Oda Kirala      | /room/         |
      | Bed & Breakfast | /bedbreakfast/ |
