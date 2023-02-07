package yt.arun.demo.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yt.arun.demo.todoapp.model.TodoItem;
import yt.arun.demo.todoapp.repository.TodoRepository;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@GetMapping("/getalltasks")
	public List<TodoItem> findAll(){
		return todoRepository.findAll();
	}
	
	@PostMapping("/savenewtask")
	public TodoItem save( @RequestBody TodoItem todoItem) {
		return todoRepository.save(todoItem);
	}
	
	@PutMapping("/updatetask")
	public TodoItem update( @RequestBody TodoItem todoItem) {
		return todoRepository.save(todoItem);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		todoRepository.deleteById(id);
	}
	
	
	

}
