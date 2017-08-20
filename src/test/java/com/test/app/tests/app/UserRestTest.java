package com.test.app.tests.app;

import com.test.app.tests.db.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

/**
 * Created by pavel on 8/20/17.
 */
public class UserRestTest {

    @Test
    public void testCanGetGithubUserInfo() {
            /*String body = "" +
                    "{\n" +
                    "  \"email\": \"test_ian@mail.com\",\n" +
                    "  \"firstname\": \"Test\",\n" +
                    "  \"lastname\": \"Testtello\",\n" +
                    "  \"username\": \"Ivanello\"\n" +
                    "}";

        RestAssured
                .given().body(body)
                .when()
                .post("http://35.184.243.175:8080/rest/user/add")
                .then().extract().response().prettyPrint();
                */


        User user = new User();
        user.setEmail("test_ian@mail.com");
        user.setFirstname("Iven");
        user.setLastname("Petrov");


        User response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("http://35.184.243.175:8080/rest/user/add")
                .then().extract().response().as(User.class);


        System.out.println(response);
    }




    }

