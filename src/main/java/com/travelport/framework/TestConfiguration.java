package com.travelport.framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class TestConfiguration {

    @BeforeSuite(alwaysRun = true)
    public void Setup(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9090;
    }
}
