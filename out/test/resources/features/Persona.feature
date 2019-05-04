Feature: Funcionalidad personas


  Scenario Outline: Registro de personas
    Given registro de una persona a traves de interfaz
    And ingresar a interfaz de registro
    And registrar formulario con los datos "<nombre>" y "<apellidos>" y "<direccion>" y "<email>" y "<nacimiento>" y "<nacionalidad>" y "<telefono>" y "<ci>"

    Examples:
      | nombre | apellidos | direccion | email | nacimiento | nacionalidad | telefono | ci |
      | juan | morales | temporal calle 10 | juan@gmail.com | 15081999 | Bolivia | 685874815 | 532562 |

  Scenario: Actualizacion de persona
    Given actualizacion de una persona por interfaz
    And ingreasr a interfaz de actualizacion
    Then realizar la actualizacion del nombre por "JUANITO"

  Scenario: validar parametros obligatorios del registro de una persona
    Given se realize un registro de una nueva persona
    And que los parametros "apellido" y "nombres" esten nulos
    When se presione el boton "guardar"
    Then no deberia registrarse una persona

  Scenario: realizar la impresion del formulario del accidente
    Given se encuentre dentro de la pagina
    And se redireccione al detalle del accidente "uno"
    And dar click al boton imprimir