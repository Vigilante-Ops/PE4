package com.vigilantex.nbcaas.Controller;

import com.vigilantex.nbcaas.CustomExceptions.CustomValidationException;
import com.vigilantex.nbcaas.Models.Customer;
import com.vigilantex.nbcaas.Models.Request;
import com.vigilantex.nbcaas.Utils.PVARLogic;
import com.vigilantex.nbcaas.Utils.ResponseEventType;
import com.vigilantex.nbcaas.Utils.ValidationChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController
{

    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("nbcaas")
    public ResponseEntity<?> test(@Valid @RequestBody Request request)
    {
        ValidationChecker.isRequestValid(request);
        String exp="[[PVAR.firstName.integer]], ddddddddddddddddddd" +
                "ddddddddddddd" +
                "ddd" +
                "  [[PVAR.lastName.integer]]        [[PVAR.mobileNumber.integer]]" +
                "" +
                "" +
                "" +
                "" +
                "[[PVAR.address.integer]]";
        List<String> fields= PVARLogic.test(exp);

        Customer c= restTemplate.getForEntity("http://localhost:8080/api/getcustomer?custid="+request.getCustomerIds().get(0).getId(), Customer.class).getBody();
        ResponseEventType ret=new ResponseEventType();
        String type=ret.checkEvent(c,fields);



        return new ResponseEntity<>(type, HttpStatus.CREATED);
    }


}
