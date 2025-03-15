
Feature: Click Counter App

  Scenario: Pulsar botón 1 vez
    Given iniciamos pantalla COUNTER
    And texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "OFF"
    When hacemos clic en boton INCREMENT
    Then texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"

  Scenario: Pulsar botón 10 veces
    Given iniciamos pantalla COUNTER
    And texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "OFF"
    When hacemos clic en boton INCREMENT 10 veces
    Then texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "ON"

  Scenario: Pulsar botón 10 veces y ver número de clics
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 10 veces
    When hacemos clic en boton CLICKS
    Then pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And texto en CLICKS muestra 10
    And boton CLEAR se encuentra "ON"

  Scenario: Pulsar botón 11 veces y resetear clics
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 11 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And texto en CLICKS muestra 11
    And boton CLEAR se encuentra "ON"
    When hacemos clic en boton CLEAR
    Then texto en CLICKS muestra 0
    And boton CLEAR se encuentra "OFF"
    And finalizamos pantalla CLICKS
    And resumimos pantalla COUNTER
    And texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"

  Scenario: Pulsar botón 12 veces y resetear contador
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 11 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And hacemos clic en boton CLEAR
    And finalizamos pantalla CLICKS
    And resumimos pantalla COUNTER
    And hacemos clic en boton INCREMENT
    And texto en COUNTER muestra 2
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"
    When hacemos clic en boton RESET
    Then texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "ON"

  Scenario: Pulsar botón 13 veces y ver número de clics
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 13 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    When rotamos pantalla
    Then texto en CLICKS muestra 13
    And boton CLEAR se encuentra "ON"

