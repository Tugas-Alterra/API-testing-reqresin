package starter.stepdefinitions;

import io.cucumber.java.en.And;
import starter.service.Reqres;

public class LoginStepDefinitions {
    Reqres reqres = new Reqres();

    @And("user send POST success login request to reqresin")
    public void userSendPOSTSuccessLoginRequestToReqresin() { reqres.postlogin();
    }

    @And("user send POST unsuccess login request to reqresin")
    public void userSendPOSTUnsuccessLoginRequestToReqresin() { reqres.postunsuccesslogin();
    }
}
