package com.vigilantex.infoAPI.Repo;

import com.vigilantex.infoAPI.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
