package es.ulpgc.eite.da.advclickcounter;

import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EspressoTests {

  EspressoTestSteps testSteps = new EspressoTestSteps();


  @Test
  public void test01_pulsar_boton_1_vez() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(false);


    // When("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();

    // Then("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

  }


  @Test
  public void test02_pulsar_boton_10_veces() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(false);

    // When("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 10; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // Then("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

  }


  @Test
  public void test03_pulsar_boton_10_veces_y_ver_numero_clicks() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 10; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }


    // When("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();

    // Then("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 10")
    testSteps.texto_en_CLICKS_muestra(10);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);

  }



  @Test
  public void test04_pulsar_boton_11_veces_y_resetear_clicks() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 11; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 11")
    testSteps.texto_en_CLICKS_muestra(11);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);

    // When("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();

    // Then("texto en CLICKS muestra 0")
    testSteps.texto_en_CLICKS_muestra(0);
    // And("boton CLEAR se encuentra DESACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(false);
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
  }




  @Test
  public void test05_pulsar_boton_12_veces_y_resetear_contador() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 11; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 2")
    testSteps.texto_en_COUNTER_muestra(2);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

    // When("hacemos clic en boton RESET")
    testSteps.hacemos_clic_en_boton_RESET();

    // Then("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
  }



  @Test
  public void test06_pulsar_boton_13_veces_y_ver_numero_clicks() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 13; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton RESET")
    testSteps.hacemos_clic_en_boton_RESET();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

    // When("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();

    // Then("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 2")
    testSteps.texto_en_CLICKS_muestra(2);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);
  }



  // ----------------------------------------------------------------------



  @Test
  public void test07_pulsar_boton_1_vez_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(false);
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();

    // When("rotamos pantalla COUNTER")
    testSteps.rotamos_pantalla();

    // Then("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

  }

  @Test
  public void test08_pulsar_boton_10_veces_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(false);
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 10; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // When("rotamos pantalla")
    testSteps.rotamos_pantalla();

    // Then("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);

  }



  @Test
  public void test09_pulsar_boton_10_veces_y_ver_numero_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 10; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();

    // And("rotamos pantalla ")
    testSteps.rotamos_pantalla();

    // Then("texto en CLICKS muestra 10")
    testSteps.texto_en_CLICKS_muestra(10);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);

  }


  @Test
  public void test10_pulsar_boton_11_veces_y_resetear_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 11; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 11")
    testSteps.texto_en_CLICKS_muestra(11);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);
    // And("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();
    // And("texto en CLICKS muestra 0")
    testSteps.texto_en_CLICKS_muestra(0);
    // And("boton CLEAR se encuentra DESACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(false);
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();

    // When("rotamos pantalla")
    testSteps.rotamos_pantalla();

    // Then("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
  }


  @Test
  public void test11_pulsar_boton_12_veces_y_resetear_contador_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 11; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 2")
    testSteps.texto_en_COUNTER_muestra(2);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton RESET")
    testSteps.hacemos_clic_en_boton_RESET();

    // When("rotamos pantalla")
    testSteps.rotamos_pantalla();

    // Then("texto en COUNTER muestra 0")
    testSteps.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    testSteps.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
  }



  @Test
  public void test12_pulsar_boton_13_veces_y_ver_numero_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    testSteps.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    for(int i=1; i <= 13; i++) {
      testSteps.hacemos_clic_en_boton_INCREMENT();
    }

    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    testSteps.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    testSteps.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    testSteps.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton RESET")
    testSteps.hacemos_clic_en_boton_RESET();
    // And("hacemos clic en boton INCREMENT")
    testSteps.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 1")
    testSteps.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    testSteps.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    testSteps.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    testSteps.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton CLICKS")
    testSteps.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    testSteps.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    testSteps.iniciamos_pantalla_CLICKS();

    // When("rotamos pantalla")
    testSteps.rotamos_pantalla();

    // Then("texto en CLICKS muestra 2")
    testSteps.texto_en_CLICKS_muestra(2);
    // And("boton CLEAR se encuentra ACTIVADO")
    testSteps.boton_CLEAR_se_encuentra(true);
  }


}
