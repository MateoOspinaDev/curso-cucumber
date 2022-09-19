Feature: suma
  Yo como matematico
  Quiero sumar dos numeros
  Para no errar en el resultado del calculo

  Scenario: Sumar dos numeros enteros
    Given quiero sumar
    When sumo 2 mas 2
    Then deberia ver el resultado es 4