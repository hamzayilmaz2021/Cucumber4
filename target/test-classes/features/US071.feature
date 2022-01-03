Feature: US_071	Bir kullanıcı olarak "/api/user/account/logout" sayfasına "get" tipinde bağlandığımda sistemden çıkış yapabilmeliyim.

#TC_001_US_071	Gelen cevabın durum kodu 200 olmalıdır.	200	200	Pass
#TC_002_US_071	Gelen cevap içerisinde "sonuc:true" değeri yer almaldıır.	{sonuc : true}	{sonuc : true}	Pass

  Scenario: kullanici durum kodunun 200 oldugunu dogrular
    Given kullanici "/user/account/logout" sayfasina get tipinde baglanir
    Then kullanici durum kodunun 200 oldugunu dogrular

  Scenario: kullanici gelen cevap icerisindeki sonuc:true ifadesinin varligini dogrular
    Given kullanici "/user/account/logout" sayfasina get tipinde baglanir
    Then kullanici gelen cevap icerisinde sonuc ozelliginin degerinin true oldugunu dogrular


  Behavioral Egzersiz 1 (Teknik kısımların ayrıntılarına girmeden, daha çok iş arkadaşlarınız ile sizin durumunuzu anlatan bir günlük iş hayatınızı özetleyiniz(Doküman))
  Ajanda Egzersizi 2 (İşe yeni başlayacak bir yazılım test uzmanına Jira kullanımını dökümante ederek anlatınız(Doküman))
  Sunum Egzersizi 3 (Projedeki diğer arkadaşlarınız ile de paylaşılacak şekilde API test methodlarını anlattığınız bir video kaydı yapınız(Video))