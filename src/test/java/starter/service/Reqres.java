package starter.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import java.io.File;

public class Reqres {
    private static final String BASE_URL = "https://reqres.in/api";

    private String composeBodyJson() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        return bodyJson.toString();
    }

    public void getSingleUser(int id){
        SerenityRest.get(BASE_URL+"/users/"+id);
    }

    public void getSingleUser(String value){
        SerenityRest.get(BASE_URL+"/users/"+value);
    }

    public void postRegister() {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(composeBodyJson())
                .post(BASE_URL + "/api/register");
    }

    public void postRegisterWithParam(String jsonPath) {
        File bodyJson = new File(String.format("src/test/resources/payload/%s", jsonPath));

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson)
                .post(BASE_URL + "/api/register");
    }
}
