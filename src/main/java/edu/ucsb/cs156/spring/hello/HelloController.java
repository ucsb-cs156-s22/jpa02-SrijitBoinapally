package edu.ucsb.cs156.spring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    int a;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from srijit!";
    }
    
}
