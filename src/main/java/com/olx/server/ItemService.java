package com.olx.server;

import java.util.List;

import com.olx.server.items.AbstractItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {

    private final ItemRepository itemRepository;


    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public List<AbstractItem> getItems() {
        return itemRepository.findAll();
    }

    public void addItem(AbstractItem item) {
        itemRepository.save(item);
    }
}
