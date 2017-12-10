package com.google.validator;


import com.google.domain.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zky
 * Date: 12/10/17
 * Time: 11:46 PM
 * Description:
 */
public class ProductValidator implements Validator
{

    public boolean supports(Class<?> aClass)
    {
        return Product.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors)
    {
        Product product = (Product) o;
        ValidationUtils.rejectIfEmpty(errors,"name","productname.required");

        ValidationUtils.rejectIfEmpty(errors,"price","price.required");
        ValidationUtils.rejectIfEmpty(errors,"productionDate","productiondate.required");
        Float price = product.getPrice();
        if(price != null && price < 0)
        {
            errors.rejectValue("price","price.negative");
        }

        Date productionDate = product.getProductionDate();
        if(productionDate != null)
        {
            // The hour,minute,second componnents of productionDate
            // are 0
            if(productionDate.after(new Date()))
            {
                System.out.println("salah lagi");
                errors.rejectValue("productionDate","productiondate.invalid");
            }

        }
    }
}
