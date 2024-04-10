package edu.iu.hmbharad.primeservice.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.oauth2.jwt.Jwt;
import edu.iu.hmbharad.primeservice.rabbitmq.MQSender;
import edu.iu.hmbharad.primeservice.service.IprimesService;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {

    IprimesService iprimesService;
    private final MQSender mqSender;

    public PrimesController(IprimesService iprimesService, MQSender mqSender) {
        this.iprimesService = iprimesService;
        this.mqSender = mqSender;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        boolean result = iprimesService.isPrime(n);
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((Jwt) principal).getSubject();
        System.out.println(username);
        mqSender.sendMessage(username, n, result);
        return result;
    }
}