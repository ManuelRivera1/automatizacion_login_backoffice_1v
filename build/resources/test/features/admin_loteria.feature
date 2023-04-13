#Autor:johana.giraldo@konexinnovation.com.co

  Feature: Administracion de loterias
    Yo como administrador
    Quiero poder administrar las loterias
    Para realizar JSA

  @Caso4
  Scenario: Creacion de loteria
      Given que el administrador se encuentre en el backoffice
      When se loguea con usuario y contrasenna
        | usuario   | contrasenna   |
        | 10974074491 | JGIRALDO10 |
      And ingrese al modulo Escrutinio y submodulo loteria
      And cree una loteria
        | codigo | nombrelargo   | nombrecorto | telefono   |
        | 01     | Prueba Johana | Prueba JAG  | 3146212518 |
    Then validara que la loteria se haya creado


