package com.shj.service.impl;

import com.shj.entity.QuestionTable;
import com.shj.dao.QuestionTableDao;
import com.shj.service.QuestionTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QuestionTable)表服务实现类
 *
 * @author shj
 * @since 2020-05-25 10:35:59
 */
@Service("questionTableService")
public class QuestionTableServiceImpl implements QuestionTableService {
    @Resource
    private QuestionTableDao questionTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    @Override
    public QuestionTable queryById(Integer qid) {
        return this.questionTableDao.queryById(qid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<QuestionTable> queryAllByLimit(int offset, int limit) {
        return this.questionTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param questionTable 实例对象
     * @return 实例对象
     */
    @Override
    public QuestionTable insert(QuestionTable questionTable) {
        this.questionTableDao.insert(questionTable);
        return questionTable;
    }

    /**
     * 修改数据
     *
     * @param questionTable 实例对象
     * @return 实例对象
     */
    @Override
    public QuestionTable update(QuestionTable questionTable) {
        this.questionTableDao.update(questionTable);
        return this.queryById(questionTable.getQid());
    }

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer qid) {
        return this.questionTableDao.deleteById(qid) > 0;
    }
}