package com.vigilantex.nbcaas.Utils;

import com.vigilantex.nbcaas.Models.Customer;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Getter
@Setter
public class ResponseEventType
{
    static Logger logger=LogManager.getLogger(ResponseEventType.class);

    public String checkEvent(Customer c, List<String> fields)
    {
        int success=0;

       for (int i=0;i<fields.size();i++)
       {
           if(fields.get(i).equals("firstName"))
           {

               if(c.getFirstName()==null)
               {
                   System.out.println("null");
               }
               else {
                   success++;
               }

           } else if (fields.get(i).equals("lastName")) {
               if(c.getLastName()==null)
               {
                   System.out.println("null");
               }
               else {
                   success++;
               }
           }
           else if (fields.get(i).equals("mobileNumber")) {
               if(c.getMobileNumber()==null)
               {
                   System.out.println("null");
               }
               else {
                   success++;
               }

           } else if (fields.get(i).equals("address")) {
               if(c.getAddress()==null)
               {
                   System.out.println("null");
               }
               else {
                   success++;
               }
           }

       }
        if(success!=fields.size())
        {
            return "fallback";
        }
        else
        {
            return "personalized";
        }


    }

}
