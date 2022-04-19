package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.service.Reqres;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SingleUserStepDefinitions {
    Reqres reqres = new Reqres();

    @When("GET request is sent to get single user data with id: {int}")
    public void getRequestIsSentToGetSingleUserDataWithId(int id) {
        reqres.getSingleUser(id);
    }

    @Then("Status response code should be {int}")
    public void statusResponseCodeShouldBe(int status) {
        restAssuredThat(response -> response.statusCode(status));
    }

    @And("Response body should be matched with {string}")
    public void responseBodyShouldBeMatchedWith(String schema) {
        String path = "schema/"+schema;

        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @When("GET request is sent to get single user data with unknown id: {int}")
    public void getRequestIsSentToGetSingleUserDataWithUnknownIdId(int id) {
        reqres.getSingleUser(id);
    }



    @When("GET request is sent to get single user data with {string}")
    public void getRequestIsSentToGetSingleUserDataWith(String value) {
        reqres.getSingleUser(value);
    }
}
