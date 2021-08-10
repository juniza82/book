package com.juniza82.book.springboot.web;

import com.juniza82.book.springboot.web.domain.HelloResponseDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        System.out.println("Hello!!");
        return "hello";
    }

    @GetMapping("/hello/domain")
    public HelloResponseDomain hellDomain(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        System.out.println("/hello/domain!!");

        return new HelloResponseDomain(name, amount);
    }

}
