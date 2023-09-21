package br.com.wferdinando.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.wferdinando.entity.Company;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CompanyRepository  implements PanacheRepository<Company>{
    
}
