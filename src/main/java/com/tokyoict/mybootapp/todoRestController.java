package com.tokyoict.mybootapp;

import java.util.List;

import com.tokyoict.mybootapp.repositories.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoRestController {

    @Autowired
    ToDoRepository repository;

    @RequestMapping(value = "/rest/todos", method = RequestMethod.GET)
    public List<ToDoData> restAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/rest/todos", method = RequestMethod.POST)
    @Transactional(readOnly = false)
    public ToDoData form(@RequestBody ToDoData tododata) {
        repository.saveAndFlush(tododata);
        return tododata;
    }

    @RequestMapping(value = "/rest/todos/{num}", method = RequestMethod.DELETE)
    @Transactional(readOnly = false)
    public ToDoData delete(@RequestBody ToDoData tododata) {
        repository.deleteById(tododata.getId());
        return tododata;
    }

    @RequestMapping(value = "/rest/todos/{num}", method = RequestMethod.PUT)
    @Transactional(readOnly = false)
    public ToDoData edit(@RequestBody ToDoData tododata) {
        repository.saveAndFlush(tododata);
        return tododata;
    }

}