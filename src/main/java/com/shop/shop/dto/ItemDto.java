package com.shop.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ItemDto {
    private Long id;
    private String itemNm;
    private Integer price;
    private String itemDetail;
    private String sellStatCd;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public ItemDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getItemNm() {
        return itemNm;
    }

    public ItemDto setItemNm(String itemNm) {
        this.itemNm = itemNm;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public ItemDto setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public ItemDto setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
        return this;
    }

    public String getSellStatCd() {
        return sellStatCd;
    }

    public ItemDto setSellStatCd(String sellStatCd) {
        this.sellStatCd = sellStatCd;
        return this;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public ItemDto setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
        return this;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public ItemDto setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
