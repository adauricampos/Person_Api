package com.adauricampos.personapi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class PersonController {


    @GetMapping
    public String getBook() {

        return "API Test!";

    }

}
