Feature: resta
  Yo como matematico
  Quiero restar dos numeros
  Para no errar en el resultado del calculo

  Scenario Outline: Restar dos numeros enteros
    Given quiero restar
    When resto <primerNumero> mas <segundoNumero>
    Then deberia ver que el resultado es <resultado>
    Examples:
    |primerNumero|segundoNumero|resultado|
    |2|2|0|
    |3|2|1|
    |4|2|2|