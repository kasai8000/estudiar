package com.tokyoict.mybootapp;

import com.tokyoict.mybootapp.repositories.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class todoController {

    @Autowired
    ToDoRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("step2");
        Iterable<ToDoData> list = repository.findAll();
        mav.addObject("todos", list);
        return mav;
    }

}