package com.google.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 12/10/17
 * Time: 11:04 PM
 * Description:
 */
public class Product implements Serializable
{

    private static final long serialVersionUID = 3602431165299813192L;

    private String name;
    private String description;
    private Float price;
    private Date productionDate;

    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Float getPrice()
    {
        return price;
    }

    public void setPrice(Float price)
    {
        this.price = price;
    }

    public Date getProductionDate()
    {
        return productionDate;
    }

    public void setProductionDate(Date productionDate)
    {
        this.productionDate = productionDate;
    }
}
