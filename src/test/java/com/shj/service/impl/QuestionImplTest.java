package com.shj.service.impl;

import com.shj.entity.Questions;
import com.shj.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class QuestionImplTest {
    
    @Resource
    private QuestionService questionService;

    @Test
    public void getAll() {
        List<Questions> all = questionService.getAll();
        System.out.println(all);
    }
}