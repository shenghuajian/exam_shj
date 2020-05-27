package com.shj.dao;

import com.shj.entity.QuestionTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (QuestionTable)表数据库访问层
 *
 * @author shj
 * @since 2020-05-25 10:35:59
 */
@Mapper
public interface QuestionTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    QuestionTable queryById(Integer qid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<QuestionTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param questionTable 实例对象
     * @return 对象列表
     */
    List<QuestionTable> queryAll(QuestionTable questionTable);

    /**
     * 新增数据
     *
     * @param questionTable 实例对象
     * @return 影响行数
     */
    int insert(QuestionTable questionTable);

    /**
     * 修改数据
     *
     * @param questionTable 实例对象
     * @return 影响行数
     */
    int update(QuestionTable questionTable);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 影响行数
     */
    int deleteById(Integer qid);

}