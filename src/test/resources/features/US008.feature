Feature: Bir kullanıcı olarak ana sayfaya girdiğimde, sayfanin sağ üst bölümünde "İlan Ekle" linkini görebilmeliyim.

  Background:
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider

  Scenario: TC_001_US_008 kullanici ilan ekle butonunun aktif olup olmadigini kontrol eder
    Then kullanici ilan ekle linkinin aktif oldugunu dogrular

  Scenario: TC_002_US_008 kullanici ilan ekle butonunun arkaplan rengini dogrular
    Then kullanici ilan ekle linkinin arkaplan renginin "rgba(25, 135, 84, 1)" oldugunu dogrular

  Scenario: TC_003_US_008 kullanici giris yapmadiginda linke tıklarsa "/login" sayfasina gitmeli
    And kullanici ilan ekle butonuna tiklar
    Then kullanici uzerinde bulundugu sayfanin urlinde "/login" ifadesini dogrular

  Scenario: TC_004_US_008 kullanici giris yaptiginda linke tıklarsa "/add_ilan" sayfasina gitmeli
    And kullanici giris yap linkine tiklar
    And kullanici sisteme "kullanici1@gmail.com" ve "Kullanici123." bilgileri ile giris yapar
    And kullanici ilan ekle butonuna tiklar
    Then kullanici uzerinde bulundugu sayfanin urlinde "/add_ilan" ifadesini dogrular













    #Neden test set olusturuyoruz o olmasada olur mu, test seti duymamistim

    # USER STORY (200)
    # Haftalık Görev : 2 User Story -                 5 (3 Gün - 2 Gün)        5 (3 Gün - 2 Gün)

    # 1. User Story ve Gereksinimlerin Anlaşılması
    # 2. Test Case
    # 3. Manuel Olarak Test Ederiz
    # 4. Automation Test Scriplerinin Yazılması

    # JIRA ADIMLARI
    # 1. Test Case oluşturmak ve User Story ile bağlantısının sağlanması
    # 2. Pre-Condition oluşturmak ve Test Case'lere bağlamak
    # 3. Test Set oluşturmak ( Eğer kullanacağımız daha önceden oluşturulan test set varsa, onu kullanabiliriz. )
    # 4. Test Plan İçerisine Test Set Eklenmesi ( Zaten ekliyse, sadece test case execute edilir.)

