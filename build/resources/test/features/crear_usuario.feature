#language:es

  @Regresion
  Característica: Crear Usuario en utest.com
    Como usuario web
    Quiero ingresar a utest.com
    A crear un nuevo usuario

  @RunnerTags
  Escenario: Crear un nuevo usuario
    Dado que jorge desea ingresar a la pagina de utest.com
    Cuando el ingrese a la pagina debe crear un usuario con los datos solicitados
    |Jorge|Soto|jrsotol@unal.edu.co|spanish|Romellopez10217514|Romellopez10217514|
    Entonces el deberia ver en pantalla el Welcome to the world's largest community of freelance software testers! de usuario creado
