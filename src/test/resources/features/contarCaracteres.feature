Feature: Contar caracteres
  yo como escritor
  quiero contar caracteres
  Para conocer la cantidad de caracteres que tienen las palabras

  Scenario: contar caracteres de una palabra
    Given quiero contar caracteres
    When cuento los caracteres de la palabra "mama"
    Then la cantidad de caracteres es 4

  Scenario: contar caracteres de un listado de palabras
    Given quiero contar caracteres
    When cuento los caracteres de listado
    |mama |
    |papa |
    Then la cantidad de caracteres es 8