package edu.iu.hmbharad.primeservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.iu.hmbharad.primeservice.service.PrimesServices;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeServiceApplicationTests {

	PrimesServices primesServices = new PrimesServices();

	@Test
	void _14IsNotPrime() {
		int n = 51;
		boolean expected = false;
		boolean actual = primesServices.isPrime(n);
		assertEquals(expected,actual);
	}

}
