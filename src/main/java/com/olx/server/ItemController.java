package com.olx.server;

import java.util.List;

import com.olx.server.items.AbstractItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/item")
public class ItemController {

    private final ItemService itemService;


    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping
    public List<AbstractItem> getItems() {
        return itemService.getItems();
    }

    @PostMapping
    public void addNewItem(@RequestBody
        AbstractItem item) {
        itemService.addItem(item);
    }

}
