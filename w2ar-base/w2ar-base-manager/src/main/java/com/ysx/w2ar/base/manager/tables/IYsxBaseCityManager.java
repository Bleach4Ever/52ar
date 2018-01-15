package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.YsxBaseCityBean;

/**
 * @实体名称: 基础_城市表
 * @数据库表: YSX_BASE_CITY
 * @开发日期: 2017-10-21
 */
public interface IYsxBaseCityManager {

    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 执行结果
     * @throws Exception   - 异常捕捉
     */
    public void getInsert(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param cityId            - 基础_城市表
     * @return YsxBaseCityBean  - 执行结果
     * @throws Exception        - 异常捕捉
     */
    public int getDelete(long cityId) throws Exception;


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 执行结果
     * @throws Exception   - 异常捕捉
     */
    public int getUpdate(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param cityId            - 基础_城市表
     * @return YsxBaseCityBean  - 执行结果
     * @throws Exception        - 异常捕捉
     */
    public YsxBaseCityBean getBean(long cityId) throws Exception;


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxBaseCity             - 基础_城市表
     * @return List<YsxBaseCityBean>  - 执行结果
     * @throws Exception              - 异常捕捉
     */
    public List<YsxBaseCityBean> getList(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 执行结果
     * @throws Exception   - 异常捕捉
     */
    public int getDeleteBean(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param cityIds     - 城市id
     * @return int        - 执行结果
     * @throws Exception  - 异常捕捉
     */
    public int getDeleteIn(long[] cityIds) throws Exception;


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 执行结果
     * @throws Exception   - 异常捕捉
     */
    public int getDeleteBy(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 执行结果
     * @throws Exception   - 异常捕捉
     */
    public int getUpdateBy(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param cityId      - 基础_城市表
     * @return int        - 存在数量
     * @throws Exception  - 异常捕捉
     */
    public int getCheck(long cityId) throws Exception;


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxBaseCity  - 基础_城市表
     * @return int         - 存在数量
     * @throws Exception   - 异常捕捉
     */
    public int getCheckBy(YsxBaseCityBean ysxBaseCity) throws Exception;


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据基础_城市表List对象执行批量新增操作.
     * @param list        - 基础_城市表List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxBaseCityBean> list) throws Exception;



}
