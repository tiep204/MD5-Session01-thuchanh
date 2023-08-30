package rikkei.academy.service;

import rikkei.academy.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    void save(Customer customer);
//    Customer update(Customer customer);
}
