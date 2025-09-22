package com.devsenai1A.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PetshopApplication {

   public static void main(String[] args) {
       SpringApplication.run(PetshopApplication.class, args);
       
   }
   @RestController
   public static class HelloWorldController {
       //localhos: 8080
       @GetMapping("/")
       public String helloWorld() {
           return "Hello World!";
       }
   }
}