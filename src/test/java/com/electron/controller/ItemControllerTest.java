package com.electron.controller;

import com.electron.model.Item;
import com.electron.repository.ItemRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemControllerTest extends TestCase {

    @Test
    public void testListItems() {

        Model mockModel = mock(Model.class);
        ItemRepository mockRepository = mock(ItemRepository.class);

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("CellPhone"));
        itemList.add(new Item("Calculator"));

        when(mockRepository.getItems()).thenReturn(itemList);

        ItemController itemController = new ItemController(mockRepository);

        String items = itemController.listItems(mockModel);

        verify(mockModel).addAttribute("items",mockRepository.getItems());
        assertEquals("ItemList", items);
    }
}