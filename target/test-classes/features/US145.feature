Feature: US_146	Bir kullanıcı olarak "/api/reference" sayfasına "get" tipinde bağlanarak referans olduğum kişileri görebilmeliyim.
  Scenario: US_146
	Given user connects to "/reference" with token to get referenced user list us one hundread fourty five
    Then user verifies the list is sorted us one hundread fourty five
