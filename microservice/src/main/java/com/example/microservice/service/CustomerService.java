package com.example.microservice.service;

import com.example.microservice.model.CustomerDTO;


public interface CustomerService {
    void addCustomer(int id, String name);
    CustomerDTO getCustomer(int id);
}
