package com.electron.repository;

import com.electron.model.Item;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class ItemRepositoryTest extends TestCase {
    ItemRepository itemRepository = new ItemRepository();

    @Test
    public void testGetItemsSize(){
        List<Item> actualItemList = itemRepository.getItems();

        assertEquals(actualItemList.size(),4);

    }

    public void testGetItemsContent(){
        List<Item> actualItemList = itemRepository.getItems();

        assertEquals(actualItemList.get(0),new Item("CellPhone"));
        assertEquals(actualItemList.get(1),new Item("Calculator"));
        assertEquals(actualItemList.get(2),new Item("Battery"));
        assertEquals(actualItemList.get(3),new Item("Television"));

    }
}