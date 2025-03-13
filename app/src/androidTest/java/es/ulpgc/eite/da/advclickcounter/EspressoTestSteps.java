package es.ulpgc.eite.da.advclickcounter;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import es.ulpgc.eite.da.advclickcounter.counter.CounterActivity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("ALL")
public class EspressoTestSteps {


  private ActivityTestRule<CounterActivity> testRule =
      new ActivityTestRule<>(CounterActivity.class,false, false);


  @And("boton INCREMENT se encuentra {string}")
  public void botonIncrementSeEncuentra(String estado) {
    boton_INCREMENT_se_encuentra(estado.equals("ON"));
  }

  @And("boton RESET se encuentra {string}")
  public void botonResetSeEncuentra(String estado) {
    boton_RESET_se_encuentra(estado.equals("ON"));
  }

  @And("boton CLICKS se encuentra {string}")
  public void botonClicksSeEncuentra(String estado) {
    boton_CLICKS_se_encuentra(estado.equals("ON"));
  }


  @Then("boton CLEAR se encuentra {string}")
  public void botonClearSeEncuentra(String estado) {
    boton_CLEAR_se_encuentra(estado.equals("ON"));
  }

  @When("hacemos clic en boton INCREMENT {int} veces")
  public void hacemosClicEnBotonIncrementVeces(int veces) {
    for(int i = 0; i < veces; i++) {
      hacemos_clic_en_boton_INCREMENT();
    }
  }

  // -------------------------------


  @Given("iniciamos pantalla COUNTER")
  public void iniciamos_pantalla_COUNTER() {
    testRule.launchActivity(null);
  }


  public void iniciamos_pantalla_STEPS() {

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }

  @Given("iniciamos pantalla CLICKS")
  public void iniciamos_pantalla_CLICKS() {

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }

  @Then("resumimos pantalla COUNTER")
  public void resumimos_pantalla_COUNTER() {
    //counterTestRule.finishActivity();
    //counterTestRule.launchActivity(null);

    /*
    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
    */
  }

  @Then("finalizamos pantalla CLICKS")
  public void finalizamos_pantalla_CLICKS() {
    pressBack();

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }

  public void finalizamos_pantalla_STEPS() {
    pressBack();

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }



  @Then("pausamos pantalla COUNTER")
  public void pausamos_pantalla_COUNTER() {

  }

  @Given("texto en COUNTER muestra {int}")
  public void texto_en_COUNTER_muestra(int numero) {

    String text= String.valueOf(numero);

    onView(withId(R.id.tvCounter))
        .check(matches(isDisplayed()))
        .check(matches(withText(text)));

  }

  @Then("texto en CLICKS muestra {int}")
  public void texto_en_CLICKS_muestra(int numero) {

    String text= String.valueOf(numero);

    onView(withId(R.id.tvClicks))
        .check(matches(isDisplayed()))
        .check(matches(withText(text)));
  }


  public void boton_INCREMENT_se_encuentra(boolean activado) {

    onView(withId(R.id.btnIncrement))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }


  public void boton_RESET_se_encuentra(boolean activado) {

    onView(withId(R.id.btnReset))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }


  public void boton_CLICKS_se_encuentra(boolean activado) {

    onView(withId(R.id.btnClicks))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }


  public void boton_CLEAR_se_encuentra(boolean activado) {

    onView(withId(R.id.btnClear))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }


  @When("hacemos clic en boton INCREMENT")
  public void hacemos_clic_en_boton_INCREMENT() {
    onView(withId(R.id.btnIncrement)).perform(click());
  }


  @When("hacemos clic en boton CLICKS")
  public void hacemos_clic_en_boton_CLICKS() {
    onView(withId(R.id.btnClicks)).perform(click());
  }


  @When("hacemos clic en boton CLEAR")
  public void hacemos_clic_en_boton_CLEAR() {
    onView(withId(R.id.btnClear)).perform(click());
  }

  @When("hacemos clic en boton RESET")
  public void hacemos_clic_en_boton_RESET() {
    onView(withId(R.id.btnReset)).perform(click());
  }


  @Then("rotamos pantalla COUNTER")
  public void rotamos_pantalla_COUNTER() {
    Context context = ApplicationProvider.getApplicationContext();
    int orientation = context.getResources().getConfiguration().orientation;
    Activity activity = testRule.getActivity();

    if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
      activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    } else {
      activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }

  }

  @Then("rotamos pantalla CLICKS")
  public void rotamos_pantalla_CLICKS() {

  }

}
