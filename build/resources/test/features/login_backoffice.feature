#Autor:johana.giraldo@konexinnovation.com.co

  Feature: verificar el login con diferentes usuarios
    Yo como usuario
  Quiero ingresar a la pagina color
  Para verificar el inicio de sesion con diferentes usuarios

  @Caso1
  Scenario Outline: Verificar el ingreso correcto con diferentes usuarios
    Given que el usuario ingresa al Backoffice
    When digita usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Then verifica que ingreso correctamente

    Examples:
      | usuario     | contrasenna   |
      | 10974074491 | JGIRALDO10    |
      | 10101012    | ADATACENTER10 |
      | 10101013    | CDATACENTER10 |


