Feature: US001_kullanici googleda hamza ifadesini arar

  Scenario: kullanici arama kutusuna hamza yazar
    Given kullanici "https://google.com"a gider
    Then kullanici "hamza" ifadesini arama kutusuna yazar