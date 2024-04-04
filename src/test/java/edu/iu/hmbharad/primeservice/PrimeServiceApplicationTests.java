package edu.iu.prebello.primeservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import edu.iu.prebello.primeservice.service.PrimesServices;

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
