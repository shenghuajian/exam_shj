package com.shj.service;

import com.shj.entity.OptionTable;
import java.util.List;

/**
 * (OptionTable)表服务接口
 *
 * @author shj
 * @since 2020-05-25 10:35:26
 */
public interface OptionTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    OptionTable queryById(Integer oid);

    List<OptionTable> queryAll();
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OptionTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param optionTable 实例对象
     * @return 实例对象
     */
    OptionTable insert(OptionTable optionTable);

    /**
     * 修改数据
     *
     * @param optionTable 实例对象
     * @return 实例对象
     */
    OptionTable update(OptionTable optionTable);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    boolean deleteById(int oid);

}