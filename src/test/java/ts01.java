import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ts01 {
    @Test
    public void getUser(){
        List<String> em = given()
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .extract().jsonPath().getList("data");


    }
}
