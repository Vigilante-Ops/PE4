package com.vigilantex.nbcaas.Models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class VendorCookie
{

    @NotNull(message = "resourceId cannot be null")
    private String resourceId;
    @NotNull(message = "marketingCloudVisitorId cannot be null")
    private String marketingCloudVisitorId;
    @NotNull(message = "authenticationState cannot be null")
    private String authenticationState;

}
