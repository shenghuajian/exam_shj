package com.shj.controller;

import com.shj.entity.OptionTable;
import com.shj.entity.Questions;
import com.shj.service.OptionTableService;
import com.shj.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OptionTable)表控制层
 *
 * @author shj
 * @since 2020-05-25 10:35:26
 */
@RestController
@RequestMapping("optionTable")
public class OptionTableController {
    /**
     * 服务对象
     */
    @Resource
    private OptionTableService optionTableService;

    @Resource
    private QuestionService questionService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OptionTable selectOne(Integer id) {
        return this.optionTableService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<Questions> selectOne() {
        return questionService.getQuestions();
    }
}