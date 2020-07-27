package com.wm.borrow.web;

import com.wm.borrow.service.ItemService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
}
