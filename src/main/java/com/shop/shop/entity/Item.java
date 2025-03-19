package com.shop.shop.entity;

import com.shop.shop.constant.ItemSellStatus;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                            // 상품코드

    @Column(nullable = false,length = 50)
    private String itemNm;                      // 상품명

    @Column(name = "price", nullable = false)
    private int price;                          // 가격

    @Column(nullable = false)
    private int stockNumber;                    // 재고수량

    @Column(nullable = false, columnDefinition = "TEXT")
    private String itemDetail;                  // 상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;      // 상품 판매 상태

    private LocalDateTime regTime;              // 등록 시간
    private LocalDateTime updateTime;           // 수정 시간

    public Long getId() {
        return id;
    }

    public Item setId(Long id) {
        this.id = id;
        return this;
    }

    public String getItemNm() {
        return itemNm;
    }

    public Item setItemNm(String itemNm) {
        this.itemNm = itemNm;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Item setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public Item setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
        return this;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public Item setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
        return this;
    }

    public ItemSellStatus getItemSellStatus() {
        return itemSellStatus;
    }

    public Item setItemSellStatus(ItemSellStatus itemSellStatus) {
        this.itemSellStatus = itemSellStatus;
        return this;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public Item setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
        return this;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public Item setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemNm='" + itemNm + '\'' +
                ", price=" + price +
                ", stockNumber=" + stockNumber +
                ", itemDetail='" + itemDetail + '\'' +
                ", itemSellStatus=" + itemSellStatus +
                ", regTime=" + regTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
