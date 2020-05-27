package com.shj.service;

import com.shj.entity.QuestionTable;
import java.util.List;

/**
 * (QuestionTable)表服务接口
 *
 * @author shj
 * @since 2020-05-25 10:35:59
 */
public interface QuestionTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    QuestionTable queryById(Integer qid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<QuestionTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param questionTable 实例对象
     * @return 实例对象
     */
    QuestionTable insert(QuestionTable questionTable);

    /**
     * 修改数据
     *
     * @param questionTable 实例对象
     * @return 实例对象
     */
    QuestionTable update(QuestionTable questionTable);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer qid);

}