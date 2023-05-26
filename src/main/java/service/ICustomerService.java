package service;

import model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    void save(Customer customer);

}
