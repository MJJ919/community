package com.example.community.mapper;

import com.example.community.model.Comment;
import com.example.community.model.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    void create(Comment comment);
}
