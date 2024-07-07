package com.example.board.mapper;

import com.example.board.domain.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM my_first_spring_db.board")
    List<Board> findAll();

    @Select("SELECT * FROM my_first_spring_db.board WHERE id = #{id}")
    Board findById(Long id);

    @Insert("INSERT INTO my_first_spring_db.board(title, content, password, created_at) VALUES(#{title}, #{content}, #{password}, NOW())")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Board board);

    @Update("UPDATE my_first_spring_db.board SET title = #{title}, content = #{content} WHERE id = #{id} AND password = #{password}")
    void update(Board board);

    @Delete("DELETE FROM my_first_spring_db.board WHERE id = #{id} AND password = #{password}")
    void delete(@Param("id") Long id, @Param("password") String password);
}
