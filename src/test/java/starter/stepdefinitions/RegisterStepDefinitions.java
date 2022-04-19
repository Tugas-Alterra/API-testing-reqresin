package starter.stepdefinitions;

import io.cucumber.java.en.When;
import starter.service.Reqres;


public class RegisterStepDefinitions {
    Reqres reqresin = new Reqres();

    // Action
    @When("user send POST Register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() {
        reqresin.postRegister();

    }

    @When("user send POST register request to reqresin with body json {string}")
    public void userSendPOSTRegisterRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.postRegisterWithParam(jsonPath);
    }

}
