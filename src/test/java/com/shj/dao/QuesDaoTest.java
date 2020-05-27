package com.shj.dao;

import com.shj.entity.Questions;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class QuesDaoTest {

    @Resource
    private QuesDao quesDao;
    @Test
    void getAll() {
        List<Questions> all = quesDao.getAll();
        System.out.println(all);
    }

    @Test
    void getOption() {
        List<String> option = quesDao.getOption(1);
        System.out.println(option);
    }
}