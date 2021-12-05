Feature: US_030	Bir kullanıcı olarak ilan ekle sayfasinda ülke listesinde tüm ülkeleri görebilmeliyim.

  Scenario: TC_001_US_030 kullanici excel dosyasinda yer alan tum ulkelerin dropdown icerisindeki varligini dogrular
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider
    And kullanici giris yap linkine tiklar
    And kullanici sisteme "kullanici1@gmail.com" ve "Kullanici123." bilgileri ile giris yapar
    And kullanici ilan ekle butonuna tiklar
    Then kullanici add_ilan sayfasinda excel dosyasindaki ulkeler bilgilerinin ulkeler dropdownu icerisindeki varligini dogrular