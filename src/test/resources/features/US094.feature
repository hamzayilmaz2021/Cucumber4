Feature: US_094	Bir kullanıcı olarak "/api/rooms" sayfasına "post" tipinde bağlandığımda gönderilen bilgiler ile yeni bir oda değişimi ilanı oluşturabilmeylim.

  Scenario: TC_001_US_094_positive
    Given user connects to "/rooms" with required datas to create a new room post
    Then user verifies the response status code is 202


  Scenario: TC_001_US_094_negative1 - without secret_token
    Given user connects to "/rooms" with required datas to create a new room post negative one
    Then user verifies the response status code is 401

  Scenario Outline: TC_001_US_094_negative2 - without one required data
    Given user connects to "/rooms" with required datas without "<tip>" to create a new room post negative two
    Then user verifies the response status code is 500
    Examples:
      | tip                        |
      | ac                         |
      | bbq                        |
      | private_garden             |
      | computer                   |
      | baby_gear                  |
      | microwave_oven             |
      | washing_machine            |
      | private_parking_space      |
      | private_parking_space_paid |
      | bicycle_child              |
      | bicycle                    |
      | video_game_console         |
      | room_description           |
      | plantcare                  |
      | cigarette                  |
      | pet                        |
      | camii                      |
      | sinema                     |
      | avm                        |
      | helalrestorant             |
      | oyunparki                  |
      | meydan                     |
      | dogayuruyusu               |
      | sporsalonu                 |
      | kayakyapma                 |
      | baliktutma                 |
      | muzeler                    |
      | bisiklet                   |
      | plaj                       |
      | lunapark                   |
      | warehouse                  |
      | lift                       |
      | balcony                    |
      | dryer                      |
      | dishwasher                 |
      | wifi                       |
      | tv                         |
      | teras                      |
      | salon                      |
      | toilets                    |
      | bathrooms                  |
      | bedrooms                   |
      | surface_area               |
      | arac                       |
      | tramway                    |
      | tren                       |
      | otobus                     |
      | yasaralik                  |
      | cinsiyet                   |
      | membercount                |
      | kirala                     |
      | degisim                    |
      | tip                        |
      | available_dates            |
      | address                    |
      | user                       |
