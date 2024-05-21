package com.in28minutes.springboot.MyFirstWebApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo (1,"Onkar","Learn Springboot",LocalDate.now().plusYears(1),false));
		todos.add(new Todo (1,"Onkar","Learn AWS",LocalDate.now().plusYears(2),false));
		todos.add(new Todo (1,"Onkar","Learn DevOps",LocalDate.now().plusYears(3),false));
		todos.add(new Todo (1,"Onkar","Learn Java",LocalDate.now().plusYears(2),false)) ;
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
	
}
