package gk.crud.controller;

import gk.crud.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
    private static Item item;

    static {
        item = new Item();
        item.setTitle("Test");
        item.setYear(1);
        item.setGenre("Test Genre");
        item.setWatched(true);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allItems() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("base");
        modelAndView.addObject("item", item);
        return modelAndView;
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

}
