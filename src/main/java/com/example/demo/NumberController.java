package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NumberController {

    @GetMapping("/double")
    public int doubleTheNum(@RequestParam( "num") int num){
        return num*2;
    }
}

