Feature: Puma

  Scenario: Ejercicio para comprar un shoe en puma.com
    Given 'PUMA ' page is loaded
      And hover Men link Header
      And click in link futbol
      And get price from element "Calzado de Fútbol X 18.3 TF"