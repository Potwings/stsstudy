package org.potwings.controller;

import java.util.List;

import javax.validation.Valid;

import org.potwings.entity.Todo;
import org.potwings.entity.TodoDTO;
import org.potwings.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/todo")
@Log4j
public class TodoController {

	@Autowired
	TodoMapper todoMapper;
	
	@GetMapping({"/add","/add2"})
	public void add() {
		
		log.info("GET--------------------------");
		

	}
	
////	@PostMapping(value = "/add", produces = "text/plain")
//	@PostMapping("/add")
////	@ResponseBody
//	public String addPost(TodoDTO todoDTO) {
//		log.info(todoDTO);
//		log.info("POST---------------------");
//		
//		Todo todo = Todo.builder().title(todoDTO.getTitle()).complete(todoDTO.getComplete()).build();
//		
//		todoMapper.insert(todo);
//		
////		return "success";
//		
//		return "redirect:/todo/list";
//	}
	
	
//	@PostMapping("/add")
//	public String addPost(@Valid TodoDTO todoDTO, BindingResult result) {
//		log.info(todoDTO);
//		log.info("POST---------------------");
//		
//		Todo todo = Todo.builder().title(todoDTO.getTitle()).complete(todoDTO.getComplete()).build();
//		
//		todoMapper.insert(todo);
//		
//	
//		return "redirect:/todo/list?msg=success";
//	}
	
	@PostMapping("/add")
	public String addPost(@Valid TodoDTO todoDTO, BindingResult result, RedirectAttributes rttr) {
		log.info(todoDTO);
		log.info("POST---------------------");
		
		if(result.hasErrors()) {
			log.info("has error" + result);
			return "/todo/add";
			
		}
		
	
		return "redirect:/todo/list";
	}
	
	
	@PostMapping("/add2")
	@ResponseBody
	public Object add2Post(@Valid TodoDTO todoDTO, BindingResult result) {
		log.info(todoDTO);
		log.info("POST---------------------");
		
		if(result.hasErrors()) {
			log.info("has error" + result);
			return result;
			
		}
		
	
		return null;
	}
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list------------");
	
		List<Todo> todos = todoMapper.selectAll();
	
		model.addAttribute("todos", todos);
		
//	
//		List<TodoDTO> list = IntStream.rangeClosed(1, 10).mapToObj(i -> {
//			TodoDTO dto = new TodoDTO();
//			dto.setTno(i);
//			dto.setTitle("AAA"+i);
//			return dto;
//			
//		}).collect(Collectors.toList());
//		
		
//		model.addAttribute("todos", list);
		
	}

	
	
}
