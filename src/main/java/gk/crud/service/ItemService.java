package gk.crud.service;

import gk.crud.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> allItems();

    void add(Item item);

    void delete(Item item);

    void edit(Item item);

    Item getById(int id);

}
