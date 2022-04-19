package starter.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqres {
    private static final String BASE_URL = "https://reqres.in/api";

    public void getSingleUser(int id){
        SerenityRest.get(BASE_URL+"/users/"+id);
    }

    public void getSingleUser(String value){ SerenityRest.get(BASE_URL+"/users/"+value); }

    public void postlogin() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(BASE_URL + "/login");
    }

    public void postunsuccesslogin() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(BASE_URL + "/login");
    }
}
