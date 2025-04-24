package com.example.patterns_banking.services;

import com.example.patterns_banking.dtos.CustomerDTO;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  private final ICustomerRepository customerRepository;

  public CustomerService(ICustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public Customer create(CustomerDTO customerDTO) {
    Customer customer = Customer
      .builder()
      .name(customerDTO.getName())
      .email(customerDTO.getEmail())
      .build();

    return customerRepository.save(customer);
  }


}
