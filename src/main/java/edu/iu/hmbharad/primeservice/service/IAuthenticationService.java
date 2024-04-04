package edu.iu.hmbharad.primeservice.service;

import java.io.IOException;

import edu.iu.hmbharad.primeservice.model.Customer;

public interface IAuthenticationService {

    boolean register(Customer customer) throws IOException;

    boolean login(String username,String password) throws IOException;
}
