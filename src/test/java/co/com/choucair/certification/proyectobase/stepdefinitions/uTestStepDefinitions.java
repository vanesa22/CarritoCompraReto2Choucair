package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.uTestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.JoinToday;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Given Rose wants to add products to his cart$")
    public void givenRoseWantsToAddProductsToHisCart(List<uTestData> academyChoucairData) {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChoucairData.get(0).getStrEmail(), academyChoucairData.get(0).getStrpassword()));
    }

        @When("^she adds a product when adding to cart$")
    public void sheAddsAProductWhenAddingToCart() {
            OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the());
   }

    @Then("^She has the product in her shopping cart$")
    public void sheHasTheProductInHerShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
    @Given("^Rose wants to add products to her cart without having an account on the platform$")
    public void roseWantsToAddProductsToHerCartWithoutHavingAnAccountOnThePlatform() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage());
    }


    @When("^she adds a product when adding to carthaving an account on the platform$")
    public void sheAddsAProductWhenAddingToCarthavingAnAccountOnThePlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(Boolean.FALSE));
    }

    @Then("^she has the product in her shopping cart even though she is registered$")
    public void sheHasTheProductInHerShoppingCartEvenThoughSheIsRegistered() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
}