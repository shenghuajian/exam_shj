package com.shj.controller;

import com.shj.entity.QuestionTable;
import com.shj.service.QuestionTableService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (QuestionTable)表控制层
 *
 * @author shj
 * @since 2020-05-25 10:35:59
 */
@RestController
@RequestMapping("questionTable")
public class QuestionTableController {
    /**
     * 服务对象
     */
    @Resource
    private QuestionTableService questionTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QuestionTable selectOne(Integer id) {
        return this.questionTableService.queryById(id);
    }

}