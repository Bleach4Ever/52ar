package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.YsxMsgQuintessenceBean;

/**
 * @实体名称: 精华表
 * @数据库表: YSX_MSG_QUINTESSENCE
 * @开发日期: 2017-10-21
 */
public interface IYsxMsgQuintessenceManager {

    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public void getInsert(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param qId                      - 精华表
     * @return YsxMsgQuintessenceBean  - 执行结果
     * @throws Exception               - 异常捕捉
     */
    public int getDelete(long qId) throws Exception;


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getUpdate(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param qId                      - 精华表
     * @return YsxMsgQuintessenceBean  - 执行结果
     * @throws Exception               - 异常捕捉
     */
    public YsxMsgQuintessenceBean getBean(long qId) throws Exception;


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxMsgQuintessence             - 精华表
     * @return List<YsxMsgQuintessenceBean>  - 执行结果
     * @throws Exception                     - 异常捕捉
     */
    public List<YsxMsgQuintessenceBean> getList(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDeleteBean(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param qIds        - 精华主键
     * @return int        - 执行结果
     * @throws Exception  - 异常捕捉
     */
    public int getDeleteIn(long[] qIds) throws Exception;


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getDeleteBy(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 执行结果
     * @throws Exception          - 异常捕捉
     */
    public int getUpdateBy(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param qId         - 精华表
     * @return int        - 存在数量
     * @throws Exception  - 异常捕捉
     */
    public int getCheck(long qId) throws Exception;


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxMsgQuintessence  - 精华表
     * @return int                - 存在数量
     * @throws Exception          - 异常捕捉
     */
    public int getCheckBy(YsxMsgQuintessenceBean ysxMsgQuintessence) throws Exception;


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据精华表List对象执行批量新增操作.
     * @param list        - 精华表List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxMsgQuintessenceBean> list) throws Exception;



}
