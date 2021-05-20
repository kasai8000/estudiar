package com.tokyoict.mybootapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "tododata")
public class ToDoData implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(nullable = false)
    private String todo;

    @Column(nullable = true)
    private String kijitsu;

    @Column
    private boolean kanryo;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getKijitsu() {
        return kijitsu;
    }

    public void setKijitsu(String kijitsu) {
        this.kijitsu = kijitsu;
    }

    public boolean isKanryo() {
        return kanryo;
    }
}