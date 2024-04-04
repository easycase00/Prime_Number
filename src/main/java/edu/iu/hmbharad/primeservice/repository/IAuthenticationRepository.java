package edu.iu.hmbharad.primeservice.repository;

import java.io.IOException;

import edu.iu.hmbharad.primeservice.model.Customer;

public interface IAuthenticationRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}
