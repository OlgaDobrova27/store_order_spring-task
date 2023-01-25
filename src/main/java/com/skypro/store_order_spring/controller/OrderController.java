package com.skypro.store_order_spring.controller;

import com.skypro.store_order_spring.model.CardProduct;
import com.skypro.store_order_spring.service.CardProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final CardProductService cardProductService;

    public OrderController(CardProductService cardProductService) {
        this.cardProductService = cardProductService;
    }

    @GetMapping("/add")
    public void addIdToList(@RequestParam("id") List<Integer> idList){
        this.cardProductService.addId(idList);
    }

    @GetMapping("/get")
    public List<Integer> getIdToList(){
        return this.cardProductService.getId();
    }

}
