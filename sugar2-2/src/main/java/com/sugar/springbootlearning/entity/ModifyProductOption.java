package com.sugar.springbootlearning.entity;

import java.math.BigDecimal;

public class ModifyProductOption {
    private String name;
    private BigDecimal retailPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }
}
