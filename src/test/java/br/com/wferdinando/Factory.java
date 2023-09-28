package br.com.wferdinando;

import br.com.wferdinando.entity.Company;

public class Factory {

    public static Company createCompany() {

        Company company = new Company();
        company.setName("Test Company");
        company.setAddress("Street ABC");
        company.setPhone("222333555");
        company.setRegistry("222588888");

        return company;
    }
}
