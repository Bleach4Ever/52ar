package com.ysx.w2ar.base.manager.tables;

import java.util.List;
import com.ysx.w2ar.base.domain.tables.QrtzFiredTriggersBean;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.ysx.w2ar.base.dao.tables.QrtzFiredTriggersDao;


/**
 * @实体名称: 
 * @数据库表: QRTZ_FIRED_TRIGGERS
 * @开发日期: 2017-10-21
 */
@Service
public class QrtzFiredTriggersManager implements IQrtzFiredTriggersManager {

    private final Logger LOG = Logger.getLogger(getClass());

    @Autowired
    private QrtzFiredTriggersDao qrtzFiredTriggersDao;
    
    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param qrtzFiredTriggers  - 
     * @return int               - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public void getInsert(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getInsert()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行新增一条数据
            qrtzFiredTriggersDao.getInsert(qrtzFiredTriggers);
        }
    }


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param entryId                 - 
     * @return QrtzFiredTriggersBean  - 执行结果
     * @throws Exception              - 异常捕捉
     */
    public int getDelete(String entryId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDelete()");
        
        // 非空判断
        if( null != entryId && !entryId.isEmpty() )
        {
            // 执行删除一条数据
            return qrtzFiredTriggersDao.getDelete(entryId);
        }
        return 0;
    }


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param qrtzFiredTriggers      - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public int getUpdate(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getUpdate()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行变更一条数据
            return qrtzFiredTriggersDao.getUpdate(qrtzFiredTriggers);
        }
        return 0;
    }


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param entryId                 - 
     * @return QrtzFiredTriggersBean  - 执行结果
     * @throws Exception              - 异常捕捉
     */
    public QrtzFiredTriggersBean getBean(String entryId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getBean()");
        
        // 非空判断
        if( null != entryId && !entryId.isEmpty() )
        {
            // 执行获取一个Bean实体
            return qrtzFiredTriggersDao.getBean(entryId);
        }
        return null;
    }


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param qrtzFiredTriggers             - 
     * @return List<QrtzFiredTriggersBean>  - 执行结果
     * @throws Exception                    - 异常捕捉
     */
    public List<QrtzFiredTriggersBean> getList(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getList()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行条件查询
            return qrtzFiredTriggersDao.getList(qrtzFiredTriggers);
        }
        return null;
    }


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param qrtzFiredTriggers  - 
     * @return int               - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public int getDeleteBean(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteBean()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行删除一条数据
            return qrtzFiredTriggersDao.getDeleteBean(qrtzFiredTriggers);
        }
        return 0;
    }


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param IDs         - 数组
     * @return int        - 执行结果
     * @throws Exception  - 异常捕捉
     */
    public int getDeleteIn(String[] IDs) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteIn()");
        
        // 非空判断
        if( null != IDs && IDs.length > 0 )
        {
            // 执行删除多条数据
            return qrtzFiredTriggersDao.getDeleteIn(IDs);
        }
        return 0;
    }


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param qrtzFiredTriggers  - 
     * @return int               - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public int getDeleteBy(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getDeleteBy()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行删除批量数据
            return qrtzFiredTriggersDao.getDeleteBy(qrtzFiredTriggers);
        }
        return 0;
    }


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param qrtzFiredTriggers  - 
     * @return int               - 执行结果
     * @throws Exception         - 异常捕捉
     */
    public int getUpdateBy(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getUpdateBy()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行变更批量数据
            return qrtzFiredTriggersDao.getUpdateBy(qrtzFiredTriggers);
        }
        return 0;
    }


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param entryId     - 
     * @return int        - 存在数量
     * @throws Exception  - 异常捕捉
     */
    public int getCheck(String entryId) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getCheck()");
        
        // 非空判断
        if( null != entryId && !entryId.isEmpty() )
        {
            // 执行验证一条数据是否存在
            return qrtzFiredTriggersDao.getCheck(entryId);
        }
        return 0;
    }


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param qrtzFiredTriggers  - 
     * @return int               - 存在数量
     * @throws Exception         - 异常捕捉
     */
    public int getCheckBy(QrtzFiredTriggersBean qrtzFiredTriggers) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getCheckBy()");
        
        // 非空判断
        if( null != qrtzFiredTriggers )
        {
            // 执行验证多条件数据是否存在
            return qrtzFiredTriggersDao.getCheckBy(qrtzFiredTriggers);
        }
        return 0;
    }


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据List对象执行批量新增操作.
     * @param list        - List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<QrtzFiredTriggersBean> list) throws Exception
    {
        // 日志
        LOG.info(getClass().getName() + " - getInsertBatch()");
        
        // 非空判断
        if( null != list && !list.isEmpty() )
        {
            // 执行Batch - 批量新增数据
            qrtzFiredTriggersDao.getInsertBatch(list);
        }
    }




}
