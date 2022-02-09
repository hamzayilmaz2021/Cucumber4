Feature: US_093	Bir kullanıcı olarak "/api/homes/homepage/ilans" sayfasına "get" tipinde bağlandığımda popüler ev ilanlarını görebilmeliyim..

  Scenario: TC_001_US_093
    Given user connects to "/homes/homepage/ilans" us ninety three
    Then user verifies the response status code is 200 us ninety three
    Then user verifies the list is sorted us ninety three
    Then user verifies the size of list is lower than or equal eight us ninety three

