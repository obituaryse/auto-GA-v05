Feature: Puma

  Scenario: Ejercicio para comprar un shoe en puma.com
    Given 'PUMA ' page is loaded
      And hover Men link Header
      And click in link futbol
      And get price from element "Calzado de Fútbol X 18.3 TF"
      And Click in element "Calzado de Fútbol X 18.3 TF"
      And select TALLA "MX 9.5"
      And click to button "Añadir al carrito"
      And Verify that VIEW SHOOPING BAG is ONE
      And Click VER CARRITO link
      And Verify "Calzado de Fútbol X 18.3 TF" title is displayed
      And Price should be $"1329.00"
      And Total should be $"1428.00"