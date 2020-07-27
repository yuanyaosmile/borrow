package com.wm.borrow.service;

import com.wm.borrow.entity.Item;

public interface ItemService {
    Item getItem(long itemId);

    int getAllCount();

    int getAvailableCount();

}
