

  Feature: US01 Medunna Websitesine kayit

    Scenario:TC01 Positive Scenario
      Given kullanici "medunnaUrl" sayfasina gider
      When kullanici user iconuna tiklar
      And kullanici Register butonuna tiklar
      And kullanici registration sayfasinin acildigini dogrular
      And kullanici SSN bilgisini girer
      And kullanici First Name bilgisini girer
      And kullanici Last Name bilgisini girer
      And kullanici Username bilgisini girer
      And kullanici Email bilgisini girer
      And kullanici New Password bilgisini girer
      And kullanici New Password Confirmation bilgisini girer
      And kullanici Register butonuna tiklar
      Then kullanici Registiration saved yazisinin gorundugunu dogrular
      And Kullanici 1 saniye bekler
      And kullanici sayfayi kapatir

