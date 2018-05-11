package com.sugar.springbootlearning.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private long id;
    private String name;
    private BigDecimal retailPrice;
    private int deleted;
    private LocalDateTime createTime;
    private LocalDateTime updateYime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateYime() {
        return updateYime;
    }

    public void setUpdateYime(LocalDateTime updateYime) {
        this.updateYime = updateYime;
    }
}
