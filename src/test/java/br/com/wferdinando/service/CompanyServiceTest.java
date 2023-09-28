package br.com.wferdinando.service;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.wferdinando.Factory;
import br.com.wferdinando.entity.Company;
import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CompanyServiceTest {

    @Inject
    CompanyService service;

    @Test
    @TestTransaction
    public void testSaveCompany() {
        Company company = Factory.createCompany();
        Assertions.assertEquals(Optional.of(company), service.saveCompany(company));
    }

    @Test
    @TestTransaction
    void testErrorSaveCompany() {
        Assertions.assertEquals(Optional.empty(), service.saveCompany(null));
    }

    @Test
    @TestTransaction
    void testGetCompanies() {
        Company company = Factory.createCompany();
        service.saveCompany(company);

        List<Company> companies = new ArrayList<>();
        companies.add(company);

        Optional<List<Company>> expected = Optional.of(companies);
        Optional<List<Company>> actual = service.getCompanies();

        Assertions.assertEquals(expected, actual);

    }
}
