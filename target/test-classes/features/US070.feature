Feature: US_070	Bir kullanıcı olarak "/api/user/account/login" sayfasına "post" tipinde bağlandığımda gönderdiğim bilgiler ile giriş yapabilmeliyim.

  #TC_001_US_070	Giriş işlemi başarılıysa, durum kodu 200 olmalıdır.	200
  #TC_002_US_070	Giriş işlemi başarısızsa, durum kodu 401 olmalıdır.	401
  #TC_003_US_070	Giriş işlemi başarılıysa, gelen cevap içerisinde kullanıcıya ait bazı bilgileri görebilmeliyim.	{sonuc: true, _id : ıdBilgisi , username : kullanıcıAdı, rol : kullanıcıTipi}
  #TC_004_US_070	Doğru bilgiler ile sisteme giriş yapabilmeliyim.	{sonuc:true}
  #TC_005_US_070	Yanlış veya eksik bilgiler ile sisteme giriş yapamamalıyım.	Durum Kodu : 401

  Scenario: TC_001_US_070_giris islemi basariliysa durum kodu 200 olmalidir
    Given kullanici "/user/account/login" sayfasina post tipinde email "admin@gmail.com" ve sifre "Admin123." bilgileri ile baglanir
    Then kullanici gelen cevabin durum kodunun 200 oldugunu dogrular

  Scenario Outline: TC_002_US_070_giris islemi basarisizsa durum kodu 401 olmalidir
    Given kullanici "/user/account/login" sayfasina post tipinde email "<email>" ve sifre "<sifre>" bilgileri ile baglanir
    Then kullanici gelen cevabin durum kodunun 401 oldugunu dogrular
    Examples:
      | email                | sifre       |
      | admin@gmail.com      | 12312312312 |
      | admindfsdf@gmail.com | 12312312312 |
      | 11admin@gmail.com    | Admin123.   |

  Scenario: TC_003_US_070_giris islemi basariliysa gelen cevap icerisinde kullaniciya ait bazi bilgileri gorebilmeliyim
    Given kullanici "/user/account/login" sayfasina post tipinde email "admin@gmail.com" ve sifre "Admin123." bilgileri ile baglanir
    Then kullanici gelen cevap icerisinde kullaniciya ait verilerin bulundugunu dogrular

  Scenario: TC_004_US_070_dogru bilgiler ile sisteme giris yapabilmeliyim
    Given kullanici "/user/account/login" sayfasina post tipinde email "admin@gmail.com" ve sifre "Admin123." bilgileri ile baglanir
    Then kullanici gelen cevap icerisinde sonuc ozelliginin var oldugunu dogrular

  Scenario Outline: TC_005_US_070_yanlis veya eksik bilgiler ile sisteme giris yapamamaliyim
    Given kullanici "/user/account/login" sayfasina post tipinde email "<email>" ve sifre "<sifre>" bilgileri ile baglanir
    Then kullanici gelen cevabin durum kodunun 401 oldugunu dogrular
    Examples:
      | email                | sifre       |
      | admin@gmail.com      | 12312312312 |
      | admindfsdf@gmail.com | 12312312312 |
      | 11admin@gmail.com    | Admin123.   |
      | admin                | 12312312312 |
      | admin                | Admin123.   |
