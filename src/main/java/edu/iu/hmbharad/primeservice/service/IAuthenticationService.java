package edu.iu.prebello.primeservice.service;

import java.io.IOException;

import edu.iu.prebello.primeservice.model.Customer;

public interface IAuthenticationService {

    boolean register(Customer customer) throws IOException;

    boolean login(String username,String password) throws IOException;
}
