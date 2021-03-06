package org.potwings.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.potwings.entity.Todo;

public interface TodoMapper {

	@Insert("insert into tbl_todo2 (title,complete) values (#{title}, #{complete}) ")
	void insert(Todo todo);
	
	void insert2(Todo todo);
	
	@Select("select * from tbl_todo2")
	List<Todo> selectAll();
	
}
