package springMongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springMongo.model.Customer;
import springMongo.repository.CustomerRepository;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/allCustomer")
    public List<Customer> hello() {
        return customerRepository.findAll();
    }

    @DeleteMapping("/delete")
    public void delete() {
        customerRepository.deleteAll();
    }

    @PostMapping("/add")
    public String createEmployee(@RequestBody Customer customer) {
        customerRepository.save(customer);
        System.out.println(customer.getFirstName()+" "+customer.getLastName());
        return "add successful";
    }
}
