package com.vigilantex.nbcaas.Utils;

import com.vigilantex.nbcaas.CustomExceptions.CustomValidationException;
import com.vigilantex.nbcaas.Models.EBrand;
import com.vigilantex.nbcaas.Models.EConsumerType;
import com.vigilantex.nbcaas.Models.EOriginatingChannel;
import com.vigilantex.nbcaas.Models.Request;
import org.yaml.snakeyaml.util.EnumUtils;

public class ValidationChecker
{
    public static boolean OriginatingChannelValidator(String orgchannel)
    {
        for(EOriginatingChannel choice:EOriginatingChannel.values())
            if (choice.name().equals(orgchannel))
                return true;
        return false;
    }
    public static boolean ConsumerTypeValidator(String consumerType)
    {
        for(EConsumerType choice:EConsumerType.values())
            if (choice.name().equals(consumerType))
                return true;
        return false;
    }
    public static boolean BrandValidator(String brand)
    {
        for(EBrand choice:EBrand.values())
            if (choice.name().equals(brand))
                return true;
        return false;
    }


    public static void isRequestValid(Request rq)
    {
        if(!ValidationChecker.OriginatingChannelValidator(rq.getOriginatingChannel()))
        {
            throw new CustomValidationException("Value of organisationId "+rq.getOriginatingChannel()+" is invalid");
        }
        if(!ValidationChecker.ConsumerTypeValidator(rq.getConsumerType()))
        {
            throw new CustomValidationException("Value of consumerType "+rq.getConsumerType()+" is invalid");
        }
        if(!ValidationChecker.BrandValidator(rq.getBrand().toUpperCase()))
        {
            throw new CustomValidationException("Value of Brand "+rq.getBrand()+" is invalid");
        }
        if(!rq.getExperienceMIMEType().matches("application/json|text/html") )
        {
            throw new CustomValidationException("Value of getExperienceMIMEType "+rq.getExperienceMIMEType()+" is invalid");
        }

    }
}
