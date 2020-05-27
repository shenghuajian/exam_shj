package com.shj.dao;

import com.shj.entity.Questions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuesDao {

    List<Questions> getAll();

    List<String> getOption(@Param("qid") int qid);
}
