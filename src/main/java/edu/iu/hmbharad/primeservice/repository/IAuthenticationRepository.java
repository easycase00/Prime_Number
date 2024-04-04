package edu.iu.prebello.primeservice.repository;

import java.io.IOException;

import edu.iu.prebello.primeservice.model.Customer;

public interface IAuthenticationRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}
