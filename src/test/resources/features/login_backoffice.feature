#Autor:johana.giraldo@konexinnovation.com.co
  #language: es

@HULOGIN
Característica: verificar el login con diferentes usuarios
  Yo como usuario
  Quiero ingresar a la pagina backoffice
  Para verificar el inicio de sesion con diferentes usuarios

  @Caso1
  Esquema del escenario: Verificar el ingreso correcto con uno o diferentes usuarios
    Dado que el usuario ingresa al Backoffice
    Cuando digita usuario y contrasenna del usuario
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y selecciona empresa
      | empresa   |
      | <empresa> |
    Entonces verifica que ingreso correctamente

    Ejemplos:
      | usuario     | contrasenna   | empresa                        |
      | 10974074491 | JGIRALDO10    | 11601 - GO                     |
      | 10101013    | CDATACENTER10 | 11601 - GO                     |
      | 123456      | 1234567       | 3227077412 - Operador Nacional |


  @Caso2
  Esquema del escenario:Verificar el ingreso de un usuario de manera erronea
    Dado que el usuario ingresa al Backoffice
    Cuando digita usuario y contrasenna del usuario
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces verifica el mensaje de error
      | mensajeError   |
      | <mensajeError> |

    Ejemplos:
      | Descripcion                       | usuario     | contrasenna   | mensajeError                                              |
      | Usuario incorrecto                | 10974074491 | ADATACENTER10 | Credenciales incorrectas. Inténtalo de nuevo.             |
      | contraseña incorrecta             | 10101022    | CLAVE         | Credenciales incorrectas. Inténtalo de nuevo.             |
      | contraseña y usuarios incorrectos | USER        | CLAVEERRADA   | Credenciales incorrectas. Inténtalo de nuevo.             |
      | rol inactivo                      | 10101024    | PROL10        | El usuario no tiene un rol activo en el sistema.          |
      | usuario inactivo                  | 10101014    | ADATACENTER10 | El usuario no se encuentra activo en el sistema.          |
      | cajero sin programación           | 1097407449  | PCAJA10       | No tiene programación de horario para la hora especifica. |





