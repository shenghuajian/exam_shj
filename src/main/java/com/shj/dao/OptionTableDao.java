package com.shj.dao;

import com.shj.entity.OptionTable;
import com.shj.entity.QuestionDTO;
import com.shj.entity.Questions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OptionTable)表数据库访问层
 *
 * @author shj
 * @since 2020-05-25 10:35:26
 */
@Mapper
public interface OptionTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    OptionTable queryById(Integer oid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OptionTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param
     * @return 对象列表
     */
    List<OptionTable> queryAll();

    /**
     * 新增数据
     *
     * @param optionTable 实例对象
     * @return 影响行数
     */
    int insert(OptionTable optionTable);

    /**
     * 修改数据
     *
     * @param optionTable 实例对象
     * @return 影响行数
     */
    int update(OptionTable optionTable);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 影响行数
     */
    int deleteById(int oid);


    /**
     * 获得所有的
     * @return
     */
    List<QuestionDTO> getAll();

    List<String> getOption(int qid);
}