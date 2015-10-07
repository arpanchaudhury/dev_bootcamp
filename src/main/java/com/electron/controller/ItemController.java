package com.electron.controller;

import com.electron.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/item")
    public String listItems(Model model) {
        model.addAttribute("items",itemRepository.getItems());
        return "ItemList";
    }
}
