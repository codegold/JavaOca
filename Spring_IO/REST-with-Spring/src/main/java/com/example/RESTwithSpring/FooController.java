package com.example.RESTwithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
public class FooController {
//
//    @Autowired
//    private IFooService service;
//
//    @GetMapping
//    public List<Foo> findAll(){
//        return service.findAll();
//    }
}
