package com.example.hrishikesh.iu.edu.prime_number.sevice;

import org.springframework.stereotype.Service;

@Service
public class PrimesService implements IPrimesService {


    @Override
    public boolean isPrime(long n){
        if(n ==2 ){
            return true;
        }
        for (long i = 2L; i < n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
