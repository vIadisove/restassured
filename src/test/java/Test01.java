import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Test01 {
    @Test
    public void getResource(){

                given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .when().get("/api/unknown")
                .then().statusCode(200);

    }
}
