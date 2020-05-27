package com.shj.service.impl;

import com.shj.entity.OptionTable;
import com.shj.dao.OptionTableDao;
import com.shj.service.OptionTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OptionTable)表服务实现类
 *
 * @author shj
 * @since 2020-05-25 10:35:26
 */
@Service("optionTableService")
public class OptionTableServiceImpl implements OptionTableService {
    @Resource
    private OptionTableDao optionTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    @Override
    public OptionTable queryById(Integer oid) {
        return this.optionTableDao.queryById(oid);
    }

    @Override
    public List<OptionTable> queryAll() {
        return optionTableDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OptionTable> queryAllByLimit(int offset, int limit) {
        return this.optionTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param optionTable 实例对象
     * @return 实例对象
     */
    @Override
    public OptionTable insert(OptionTable optionTable) {
        this.optionTableDao.insert(optionTable);
        return optionTable;
    }

    /**
     * 修改数据
     *
     * @param optionTable 实例对象
     * @return 实例对象
     */
    @Override
    public OptionTable update(OptionTable optionTable) {
        this.optionTableDao.update(optionTable);
        return this.queryById(optionTable.getOid());
    }

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int oid) {
        return this.optionTableDao.deleteById(oid) > 0;
    }
}