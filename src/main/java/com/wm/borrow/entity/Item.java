package com.wm.borrow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Item {
    private long id;
    private String name;
    private BigDecimal price;
    private int count;

    public Item() {
    }

    public Item(long id) {
        this.id =id;
    }
}
