package br.com.wferdinando.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import br.com.wferdinando.Factory;
import br.com.wferdinando.entity.Company;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
class CompanyControllerTest {

    @Test
    void testSaveCompanyEndPoint() throws Exception {
        Company company = Factory.createCompany();

        RestAssured
                .given()
                .contentType("application/json")
                .body(company)
                .when()
                .post("/company")
                .then()
                .statusCode(200)
                .body("name", equalTo("Test Company"))
                .body("address", equalTo("Street ABC"))
                .body("phone", equalTo("222333555"))
                .body("registry", equalTo("222588888"));
    }

    @Test
    void testFindAllCompaniesEndPoint() throws Exception {
        RestAssured
                .when()
                .get("/company")
                .then()
                .statusCode(200)
                .body("size()", greaterThanOrEqualTo(0));
    }
}
