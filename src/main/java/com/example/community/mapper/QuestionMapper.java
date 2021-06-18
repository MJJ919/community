package com.example.community.mapper;

import com.example.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    void insert(Question question);

    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    Integer count();
}
