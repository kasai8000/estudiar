package com.tokyoict.mybootapp.repositories;

import com.tokyoict.mybootapp.ToDoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ToDoRepository extends JpaRepository<ToDoData, Long> {

}