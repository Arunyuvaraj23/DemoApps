package yt.arun.demo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yt.arun.demo.todoapp.model.TodoItem;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Long>{

	
}
