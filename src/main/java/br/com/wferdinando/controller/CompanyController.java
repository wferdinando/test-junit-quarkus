package br.com.wferdinando.controller;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.wferdinando.entity.Company;
import br.com.wferdinando.service.CompanyService;

@Path("/company")
public class CompanyController {

    @Inject
    CompanyService service;

    @POST
    @Transactional
    public Response saveUser(Company company) {
        Optional<Company> savedCompany = service.saveCompany(company);

        if (savedCompany.isPresent()) {
            return Response.ok(savedCompany.get()).build();
        }
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }

    @GET
    public Response findAllCompany() {
        Optional<List<Company>> companies = service.getCompanies();
        if (companies.isPresent()) {
            return Response.ok(companies).build();
        }
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }

}
