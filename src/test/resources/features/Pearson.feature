Feature: Pearson

  Scenario: page pearson listening Comprehesion
    Given 'PHP travel' page is loaded
    And click 'button Start' in  page Listening
    And choose 'options' in page question one
    Then select 'options correct' press option sister
    And click in the next view
    And choose 'options' in page question two
    Then select 'options correct' press option mother
    And click in the next view
    And choose 'options' in page question three
    Then select 'options correct' press option father
    And click in the next view
    And choose 'options' in page question four
    Then select 'options correct' press option sisters
    And click in the next view

  Scenario: page pearson Reading Comprehension
    Given 'PHP travel' page is loaded
    And click 'button Start' in  page Reading
    Then choose 'options radio button' in page question one
    And click in the next view

  Scenario: page pearson Grammar and Vocabulary
    Given 'PHP travel' page is loaded
    And click 'button Start' in page gramar
    And choose 'option' in page question one
    Then select 'options correct' press option sons
    And click in the next view
    And choose 'option' in page question two
    Then select 'options correct' press option children
    And click in the next view
    And choose 'option' in page question three
    Then select 'options correct' press option young
    And click in the next view
    And choose 'option' in page question four
    Then select 'options correct' press option twenty
    And click in the next view
    And choose 'option' in page question five
    Then select 'options correct' press option grandfather
    And click in the next view

  Scenario: page pearson Grammar unit five
    Given 'PHP travel' page is loaded
    And click 'button Start' in page gramartic
    And choose 'option' in Five page question one
    Then select 'options correct' press option eigth
    And click in the next view
    And choose 'option' in Five page question two
    Then select 'options correct' press option time
    And click in the next view
    And choose 'option' in Five page question three
    Then select 'options correct' press option midnight
    And click in the next view
    And choose 'option' in Five page question four
    Then select 'options correct' press option bookstore
    And click in the next view
    And choose 'option' in Five page question five
    Then select 'options correct' press option saturday
    And click in the next view
    And choose 'option' in Five page question six
    Then select 'options correct' press option april
    And click in the next view

#*******************************************************************************************
  Scenario: Ver detalle de artefacto
    Given 'SisSecurity' page inventario is loaded
    And choose option one click 'Ver detalles' on page inventario


  Scenario: Eliminar artefacto
    Given 'SisSecurity' page Inventario es ta cargado
    And choose option one click 'Dar de baja' on page inventario

  Scenario Outline: Crear artefacto
    Given crear artefacto
    And agregar artefacto "<nombre>" and "<modelo>" and "<estado>" and <cantidad> on page formulario

    Examples:
      | nombre   | modelo | estado     | cantidad |
      | Taladora | 2019   | Regular    | 1        |
      | Pala     | 2010   | Mal estado | 5        |








