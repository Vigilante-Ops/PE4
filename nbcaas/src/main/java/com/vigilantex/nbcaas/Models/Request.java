package com.vigilantex.nbcaas.Models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Request
{

    @NotNull(message = "originating channel cannot be null")
    private String originatingChannel;
    @NotNull(message = "brand cannot be null")
    private String brand;
    @NotNull(message = "consumerType cannot be null")
    private String consumerType;
    @NotNull(message = "experienceMIMEType cannot be null")
    private String experienceMIMEType;

    @Size(min = 1,message = "vendorCookie cannot be null")
    @Valid
    private List<VendorCookie> vendorCookie=new ArrayList<>();
    @Size(min = 1,message = "customerIds cannot be null")
    @Valid
    private List<CustomerIds> customerIds=new ArrayList<>();
    @Size(min=1,message = "externalCustomerReferenceIds cannot be null")
    @Valid
    private List<ExternalCustomerReferenceIds> externalCustomerReferenceIds=new ArrayList<>();



}
