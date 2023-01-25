package com.skypro.store_order_spring.service;

import com.skypro.store_order_spring.model.CardProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardProductService {
    private final CardProduct cardProduct;

    public CardProductService(CardProduct cardProduct) {
        this.cardProduct = cardProduct;
    }

    public void addId(List<Integer> idList){
        this.cardProduct.addCard(idList);
    }

    public List<Integer> getId(){
        return this.cardProduct.getList();
    }
}
