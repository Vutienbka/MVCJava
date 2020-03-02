package MVC_Customer.CustomerService;

import MVC_Customer.Model.Customer;

import java.util.List;

public interface I_CustomerService {
    List<Customer> findAll();
    void save (Customer customer);
    Customer findById(int Id);
    void update(int Id, Customer customer);
    void remove(int Id);
}
