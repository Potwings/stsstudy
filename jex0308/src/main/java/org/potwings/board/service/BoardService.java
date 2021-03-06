package org.potwings.board.service;

import java.util.List;

import org.potwings.board.domain.Board;
import org.potwings.board.dto.BoardDTO;
import org.potwings.common.dto.PageDTO;

public interface BoardService {

	List<BoardDTO> getList(PageDTO pageDTO);
	 
	default Board toDomain(BoardDTO dto) {
		
		
		return Board.builder()
				.bno(dto.getBno())
				.title(dto.getTitle())
				.content(dto.getContent())
				.writer(dto.getWriter())
				.build();
	}
	
	default BoardDTO toDTO(Board board) {
		
		return BoardDTO.builder()
				.bno(board.getBno())
				.title(board.getTitle())
				.content(board.getContent())
				.writer(board.getWriter())
				.build();
	}
	
}
