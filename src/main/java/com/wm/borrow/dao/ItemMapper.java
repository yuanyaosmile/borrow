package com.wm.borrow.dao;

import com.wm.borrow.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper extends tk.mybatis.mapper.common.Mapper<Item> {
}
