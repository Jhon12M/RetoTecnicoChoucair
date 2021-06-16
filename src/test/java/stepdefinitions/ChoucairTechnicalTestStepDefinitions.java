package user.creation.utest.com.reto.tecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.CreateAccount;
import tasks.OpenUp;

import java.util.List;


public class ChoucairTechnicalTestStepDefinitions {

    @Before public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the Jonathan wants to pass the automation technical challenge of the Choucair company$")
    public void theJonathanWantsToPassTheAutomationTechnicalChallengeOfTheChoucairCompany() {
        OnStage.theActorCalled("Jonathan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he registers the user on the Utestcom platform$")
    public void heRegistersTheUserOnTheUtestComPlatform(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateAccount.onThePage(
                utestData.get(0).getStrFistName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrMonth(),
                utestData.get(0).getStrDay(),
                utestData.get(0).getStrYear(),
                utestData.get(0).getStrPassword()
        ));
    }

    @Then("^register the user$")
    public void registerTheUser(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrRegistration())));
    }
}
