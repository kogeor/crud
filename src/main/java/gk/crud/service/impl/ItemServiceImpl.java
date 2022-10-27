package gk.crud.service.impl;

import gk.crud.dao.ItemDAO;
import gk.crud.dao.impl.ItemDAOImpl;
import gk.crud.model.Item;
import gk.crud.service.ItemService;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public List<Item> allItems() {
        return itemDAO.allItems();
    }

    @Override
    public void add(Item item) {
        itemDAO.add(item);
    }

    @Override
    public void delete(Item item) {
        itemDAO.delete(item);
    }

    @Override
    public void edit(Item item) {
        itemDAO.edit(item);
    }

    @Override
    public Item getById(int id) {
        return itemDAO.getById(id);
    }
}
