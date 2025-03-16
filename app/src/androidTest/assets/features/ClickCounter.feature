Feature: Click Counter App

  Scenario: Press increment button once (test01)
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

  Scenario: Press increment button 10 times (test02)
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

  Scenario: Press increment button 10 times and view clicks count (test03)
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 10 veces
    When hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    Then texto en CLICKS muestra 10
    And boton CLEAR se encuentra "ON"

  Scenario: Press increment button 11 times and reset clicks (test04)
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

  Scenario: Press increment button 12 times and reset counter (test05)
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

  Scenario: Press increment button 13 times and check clicks count (test06)
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 13 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And hacemos clic en boton CLEAR
    And finalizamos pantalla CLICKS
    And resumimos pantalla COUNTER
    And hacemos clic en boton INCREMENT
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"
    And hacemos clic en boton RESET
    And hacemos clic en boton INCREMENT
    Then texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"
    When hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    Then texto en CLICKS muestra 2
    And boton CLEAR se encuentra "ON"

  Scenario: Press increment button once and rotate screen (test07)
    Given iniciamos pantalla COUNTER
    And texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "OFF"
    And hacemos clic en boton INCREMENT
    When rotamos pantalla COUNTER
    Then texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"

  Scenario: Press increment button 10 times and rotate screen (test08)
    Given iniciamos pantalla COUNTER
    And texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "OFF"
    And hacemos clic en boton INCREMENT 10 veces
    When rotamos pantalla COUNTER
    Then texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "ON"

  Scenario: Press increment button 10 times and view clicks count with rotation (test09)
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 10 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And rotamos pantalla CLICKS
    Then texto en CLICKS muestra 10
    And boton CLEAR se encuentra "ON"

  Scenario: Press increment button 11 times and reset clicks with rotation (test10)
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 11 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And texto en CLICKS muestra 11
    And boton CLEAR se encuentra "ON"
    And hacemos clic en boton CLEAR
    And texto en CLICKS muestra 0
    And boton CLEAR se encuentra "OFF"
    And finalizamos pantalla CLICKS
    And resumimos pantalla COUNTER
    When rotamos pantalla COUNTER
    Then texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"

  Scenario: Press increment button 12 times and reset counter with rotation (test11)
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
    And hacemos clic en boton RESET
    When rotamos pantalla COUNTER
    Then texto en COUNTER muestra 0
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "OFF"
    And boton CLICKS se encuentra "ON"

  Scenario: Press increment button 13 times and check clicks count with rotation (test12)
    Given iniciamos pantalla COUNTER
    And hacemos clic en boton INCREMENT 13 veces
    And hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And hacemos clic en boton CLEAR
    And finalizamos pantalla CLICKS
    And resumimos pantalla COUNTER
    And hacemos clic en boton INCREMENT
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"
    And hacemos clic en boton RESET
    And hacemos clic en boton INCREMENT
    And texto en COUNTER muestra 1
    And boton INCREMENT se encuentra "ON"
    And boton RESET se encuentra "ON"
    And boton CLICKS se encuentra "ON"
    When hacemos clic en boton CLICKS
    And pausamos pantalla COUNTER
    And iniciamos pantalla CLICKS
    And rotamos pantalla CLICKS
    Then texto en CLICKS muestra 2
    And boton CLEAR se encuentra "ON"