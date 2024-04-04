package edu.iu.prebello.primeservice.repository;

import org.springframework.data.repository.CrudRepository;
import edu.iu.prebello.primeservice.model.Customer;

public interface AuthenticationDBRepository extends CrudRepository<Customer, String>{
    Customer findByUsername(String username);
}
