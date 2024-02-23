package com.example.hrishikesh.iu.edu.prime_number.sevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService=new PrimesService();

    @Test
    void _45IsNotPrime() {
        int n =45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _539828945930573IsNotPrime() {
        long n =539828945930573L;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _285191IsPrime() {
        int n =285191;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }


}