package com.swnofer;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request){
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setAge(request.age());
        customer.setEmail(request.email());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        customerRepository.deleteById(id);
    }

    @PutMapping("{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") Integer id, @RequestBody UpdateCustomerRequest request){
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            Customer customerToUpdate = customer.get();
            customerToUpdate.setName(request.name());
            customerToUpdate.setEmail(request.email());
            customerToUpdate.setAge(request.age());
            customerRepository.save(customerToUpdate);
            return customerToUpdate;
        }
        return customer.get();
    }
}
