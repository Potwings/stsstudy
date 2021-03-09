package org.potwings.board.controller;

import java.util.List;

import org.potwings.board.dto.BoardDTO;
import org.potwings.board.service.BoardService;
import org.potwings.common.dto.PageDTO;
import org.potwings.common.dto.PageMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService service;

	@GetMapping({"/","/list"})
	public String getlist(Model model,@ModelAttribute("pageDTO") PageDTO pageDTO) {
		
		PageMaker pageMaker = new PageMaker();
		
		List<BoardDTO> list = service.getList(pageDTO);
		
		model.addAttribute("list",list);
		
		return "board/list";
	}
	
}
