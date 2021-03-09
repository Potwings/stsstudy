package org.potwings.board.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.potwings.board.domain.Board;
import org.potwings.board.dto.BoardDTO;
import org.potwings.board.mapper.BoardMapper;
import org.potwings.common.dto.PageDTO;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class BoardServiceImple implements BoardService {

	private final BoardMapper boardMapper;
	
	@Override
	public List<BoardDTO> getList(PageDTO pageDTO) {

		List<Board> volist = boardMapper.getlist(pageDTO.getSkip(), pageDTO.getPerSheet());

		return volist.stream().map(board-> {
			BoardDTO dto = toDTO(board);
			return dto;
		}).collect(Collectors.toList());
			
		
//		List<BoardDTO> dtolist = new ArrayList<>();
//				
//		volist.forEach(b -> dtolist.add(toDTO(b)));
		
	}

}
