Feature: Bir kullanıcı olarak ana sayfaya girdiğimde, sayfanin sağ üst bölümünde "İlan Ekle" linkini görebilmeliyim.

  Scenario: TC_001_US_008 kullanici ilan ekle butonunun aktif olup olmadigini kontrol eder
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider
    Then kullanici ilan ekle linkinin aktif oldugunu dogrular

  Scenario: TC_002_US_008 kullanici ilan ekle butonunun arkaplan rengini dogrular
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider
    Then kullanici ilan ekle linkinin arkaplan renginin "rgba(25, 135, 84, 1)" oldugunu dogrular