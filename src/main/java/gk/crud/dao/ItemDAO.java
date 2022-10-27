package gk.crud.dao;

import gk.crud.model.Item;

import java.util.List;

public interface ItemDAO {
    List<Item> allItems();

    void add(Item item);

    void delete(Item item);

    void edit(Item item);

    Item getById(int id);

}
