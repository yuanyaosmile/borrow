package com.wm.borrow.service.impl;

import com.wm.borrow.dao.ItemMapper;
import com.wm.borrow.entity.Item;
import com.wm.borrow.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    ItemMapper itemMapper;

    public ItemServiceImpl(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }


    @Override
    public Item getItem(long itemId) {
        return itemMapper.selectOne(new Item(itemId));
    }

    @Override
    public int getAllCount() {
        return itemMapper.selectCount(new Item());
    }

    @Override
    public int getAvailableCount() {
        return 0;
    }
}
