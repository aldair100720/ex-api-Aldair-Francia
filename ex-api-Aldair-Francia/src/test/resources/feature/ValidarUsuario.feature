Feature: Validar Usuario
  @test1
  Scenario: Validar Usuario
    When valido el usuario con id 516 y titulo "PUBG"
    Then el codigo de respuesta es 200

    * print response

