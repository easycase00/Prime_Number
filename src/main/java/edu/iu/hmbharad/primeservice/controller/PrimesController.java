package edu.iu.hmbharad.primeservice.controller;


import org.springframework.web.bind.annotation.*;

import edu.iu.hmbharad.primeservice.service.IprimesService;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {

    IprimesService iprimesService;

    public PrimesController(IprimesService iprimesService) {
        this.iprimesService = iprimesService;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return iprimesService.isPrime(n);
    }
}
