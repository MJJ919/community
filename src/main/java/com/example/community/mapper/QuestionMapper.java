package com.example.community.mapper;

import com.example.community.dto.QuestionDTO;
import com.example.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    void create(Question question);

    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    Integer count();

    List<Question> listByUserId(@Param("userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    Integer countByUserId(@Param("userId") Integer userId);

    Question getById(@Param("id") Integer id);

    void update(Question question);
}
