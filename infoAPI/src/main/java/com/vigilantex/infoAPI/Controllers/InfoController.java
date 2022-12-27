package com.vigilantex.infoAPI.Controllers;

import com.vigilantex.infoAPI.Model.Customer;
import com.vigilantex.infoAPI.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InfoController
{
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("save")
    public ResponseEntity<String> saveCustomer()
    {
        Customer c=new Customer();
        c.setFirstName("Adarsh");


        customerRepo.save(c);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @GetMapping("getcustomer")
    public Customer getCustomer(@RequestParam("custid") int custid)
    {
        return customerRepo.findById(custid).get();
    }


}
