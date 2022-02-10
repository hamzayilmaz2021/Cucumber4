Feature: US_096	Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

    Background: Get room id
      Given user connects to "/rooms" with required datas to create a new room post

	Scenario: TC_001_US_096
      Given user connects to "/rooms/" us ninety six
      Then user verifies the response status code is 200 us ninety six
      Then user verifies the value of deleted count propert is 1
      Then user verifies the room is deleted from the database


