
Feature: Autodoc uygulamasi gorevleri yerine getirilir

  Scenario: Autodoc uygulamasi kategorilerinden otolastigi secimi yapilarak alisveris sepetine eklendigi dogrulanir
    * Sayfa giris ayarlari yapilir
    * "Tyres and related products" linkine tiklanir
    * "Tyres" linkine tiklanir
    * Season kismindan "All-season tyres" secilir
    * Width olcusu "315" secilir
    * Height olcusu "55" secilir
    * Diameter olcusu "17" secilir
    * "SEARCH TYRES" butonuna basilir
    * "Filter" butonuna basilir
    * Brand bolumunden ilk marka secilir
    * "Apply" butonuna basilir
    * Listeden ilk urun secilir
    * Detay sayfasindan ADD butonuna basilarak urunler sepete eklenir
    * Urunun sepete eklendigi dogrulanir


  @auto
  Scenario: Autodoc uygulamasi kategorilerinden Electrics secimi yapilarak alisveris sepetine eklendigi dogrulanir
    * Sayfa giris ayarlari yapilir
    * Kaydirarak "Electrics" linkine tiklanir
    * Kaydirarak "Indicator Bulb" linkine tiklanir
    * Car maker linkine tiklanir
    * "FORD" secilir
    * "B-Max (JK8) (10.2012 - ...)" secilir
    * "1.6 TDCi (70 KW / 95 PS) (10.2012 - ...)" secilir
    * "H15" secilir
    * "Apply" butonuna basilir
    * Listedeki ilk urun secilir
    * Detay sayfasindan ADD butonuna basilarak urunler sepete eklenir
    * Urunun sepete eklendigi dogrulanir


