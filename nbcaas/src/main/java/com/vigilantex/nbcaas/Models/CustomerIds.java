package com.vigilantex.nbcaas.Models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CustomerIds
{
    @NotNull(message = "CustomerIds.id field cannot be null")
    private String id;
    @NotNull(message = "CustomerIds.idSchemeid field cannot be null")
    private String idScheme;

}
