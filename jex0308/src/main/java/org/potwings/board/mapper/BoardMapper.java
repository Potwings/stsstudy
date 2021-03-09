package org.potwings.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.potwings.board.domain.Board;

public interface BoardMapper {

	List<Board> getlist(@Param("skip") Integer skip, @Param("perSheet") Integer perSheet);
	
	
	void insert(Board board);
}
