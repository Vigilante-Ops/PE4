package com.vigilantex.nbcaas.Models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ExternalCustomerReferenceIds
{
    @NotNull(message = "ExternalCustomerReferenceIds.id field cannot be null")
    private String id;
    @NotNull(message = "ExternalCustomerReferenceIds.idSchemeid field cannot be null")
    private String idScheme;
}
