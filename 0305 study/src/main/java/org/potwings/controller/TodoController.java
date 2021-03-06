package org.potwings.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.potwings.entity.TodoDTO;
import org.potwings.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/todo")
@Log4j
public class TodoController {

	@Autowired
	TodoMapper todoMapper;
	
	@GetMapping("/add")
	public void add() {
		
		log.info("GETnsw--------------------------");
	}

	
	@PostMapping("/add")
	public String addPost(@Valid TodoDTO todoDTO,BindingResult result, RedirectAttributes rttr ) {
		log.info(todoDTO);
		log.info("POST---------------------");
		
		if(result.hasErrors()) {
			log.info(result);
			return "/todo/add";
		}
		
		
//		Todo todo = Todo.builder().title(todoDTO.getTitle()).complete(todoDTO.getComplete()).build();
//		
//		todoMapper.insert(todo);
		
		
		rttr.addFlashAttribute("msg", "success");
		
		
	
		return "redirect:/todo/list";
	}
	
	
	@GetMapping("/list")
	public void list(Model model,@ModelAttribute("todo")TodoDTO todoDTO) {
		log.info("list------------");
		List<TodoDTO> list = IntStream.rangeClosed(1, 10).mapToObj(i->{
			TodoDTO todo = new TodoDTO();
			todo.setTitle("title"+i);
			todo.setTno(i);
			return todo;
		}).collect(Collectors.toList());
		
		
		model.addAttribute("list", list);
		
			
	}

	
	
}

