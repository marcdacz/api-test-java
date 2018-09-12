package com.travelport.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CheckAvailability {

    @Test
    public void validateCheckAvailability() {
        given().get("/checkAvailability/2013-04-11").then().statusCode(200).log().all();
    }
}
