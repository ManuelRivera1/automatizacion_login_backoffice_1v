#Autor: johana.giraldo@konexinnovation.com.co

  Feature: Administracion de sorteos
    Yo como administrador
    Quiero poder administrar los sorteos
    Para poder realizar JSA


    @Caso5
  Scenario: Validar la creacion correcta de un sorteo
    Given que el administrador se encuentre en el backoffice
      When se loguea con usuario y contrasenna
        | usuario   | contrasenna   |
        | 10974074491| JGIRALDO10|
      And ingrese al modulo Escrutinio y submodulo sorteo
      And cree un sorteo
        | numerosorteo | numeroincrementaldelsorteo | horasorteo | msjsolicitud          |
        | 001          | 1                          | 100000p    | prueba automatización |
      Then validara que el sorteo se haya creado
