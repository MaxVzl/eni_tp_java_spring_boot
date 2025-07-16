package fr.eni.eni_tp_java_spring_boot.controllers;

import fr.eni.eni_tp_java_spring_boot.models.Customer;
import fr.eni.eni_tp_java_spring_boot.services.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class CustomerController implements BaseController<Customer> {
    private final CustomerService customerService;

    public CustomerController(CustomerService clientService) {
        this.customerService = clientService;
    }

    //@Override
    @GetMapping("")
    public Iterable<Customer> index(@RequestParam(required = false) String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            return this.customerService.search(lastName);
        } else {
            return this.customerService.findAll();
        }
    }

    @Override
    @GetMapping("/{id}")
    public Customer show(@PathVariable String id) {
        return this.customerService.findById(id);
    }

    @Override
    @PostMapping("")
    public Customer create(@RequestBody Customer entity) {
        return this.customerService.create(entity);
    }

    @Override
    @PutMapping("/{id}")
    public Customer update(@PathVariable String id, @RequestBody Customer entity) {
        return this.customerService.update(id, entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.customerService.delete(id);
    }
}
