package gk.crud.dao.impl;

import gk.crud.dao.ItemDAO;
import gk.crud.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemDAOImpl implements ItemDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Item> items = new HashMap<>();

    static {
        Item item1 = new Item();
        item1.setId(AUTO_ID.getAndIncrement());
        item1.setTitle("Начало");
        item1.setYear(2010);
        item1.setGenre("Научная фантастика");
        item1.setWatched(true);
        items.put(item1.getId(), item1);
        Item item2 = new Item();
        item2.setId(AUTO_ID.getAndIncrement());
        item2.setTitle("Аватар");
        item2.setYear(2010);
        item2.setGenre("Научная фантастика");
        item2.setWatched(true);
        items.put(item2.getId(), item2);
    }

    @Override
    public List<Item> allItems() {
        return new ArrayList<>(items.values());
    }

    @Override
    public void add(Item item) {
        item.setId(AUTO_ID.getAndIncrement());
        items.put(item.getId(), item);
    }

    @Override
    public void delete(Item item) {
        items.remove(item.getId());
    }

    @Override
    public void edit(Item item) {
        items.put(item.getId(), item);
    }

    @Override
    public Item getById(int id) {
        return items.get(id);
    }
}
