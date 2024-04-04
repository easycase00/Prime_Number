package edu.iu.hmbharad.primeservice.repository;

import org.springframework.data.repository.CrudRepository;
import edu.iu.hmbharad.primeservice.model.Customer;

public interface AuthenticationDBRepository extends CrudRepository<Customer, String>{
    Customer findByUsername(String username);
}
