package yt.arun.demo.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoItem {

	
	private Long id;
	
	private String taskName;
	private Boolean completed = Boolean.FALSE;
	
	
	
	public TodoItem() {
		
	}

	

public TodoItem(Long id, String taskName, Boolean completed) {
		this.id = id;
		this.taskName = taskName;
		this.completed = completed;
	}



@Id
@GeneratedValue
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTaskName() {
		return taskName;
	}



	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}



	public Boolean getCompleted() {
		return completed;
	}



	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	
	
}
