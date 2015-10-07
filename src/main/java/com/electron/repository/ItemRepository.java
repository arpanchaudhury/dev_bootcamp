package com.electron.repository;

import com.electron.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {

    public List<Item> getItems() {
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("CellPhone"));
        itemList.add(new Item("Calculator"));
        itemList.add(new Item("Battery"));
        itemList.add(new Item("Television"));
        return itemList;
    }

}
