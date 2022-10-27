package gk.crud.controller;

import gk.crud.model.Item;
import gk.crud.service.ItemService;
import gk.crud.service.impl.ItemServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BaseController {
    private ItemService itemService = new ItemServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allItems() {
        List<Item> items = itemService.allItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("base");
        modelAndView.addObject("itemsList", items);
        return modelAndView;
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

}
