package com.skypro.store_order_spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class CardProduct {

    private final List<Integer> idCardProduct = new ArrayList<>();


    public void addCard(List<Integer> idList) {
        this.idCardProduct.addAll(idList);
    }


    public List<Integer> getList() {
        return this.idCardProduct;
    }
}
