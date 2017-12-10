package com.google.controller;

import com.google.domain.Product;
import com.google.validator.ProductValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: zky
 * Date: 12/11/17
 * Time: 12:28 AM
 * Description:
 */
@Controller
public class ProductController
{
    private static final Log logger= LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/product_input")
    public String inputProduct(Model model)
    {
        model.addAttribute("product",new Product());
        return "ProductForm";
    }


    @RequestMapping(value="/product_save")
    public String saveProduct(@ModelAttribute Product product, BindingResult bindingResult,Model model)
    {
        ProductValidator productValidator = new ProductValidator();
        productValidator.validate(product,bindingResult);

        if(bindingResult.hasErrors())
        {
            FieldError fieldError = bindingResult.getFieldError();
            logger.info("Code:"+fieldError.getCode()+", field:"+fieldError.getField());
            return "ProductForm";
        }

        model.addAttribute("product",product);

        return "ProductDetails";
    }


    @org.springframework.web.bind.annotation.InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // this will apply the validator to all request-handling methods
        binder.setValidator(new ProductValidator());
        binder.validate();
    }
}
