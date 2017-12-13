package com.yhsoft.framework.core.persistence;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * 
 * 类名称：CustomMapper<br>
 * 类描述：DAO支持类实现<br>
 * @author qinjiaxue<br>
 * @创建时间：2017年5月22日 下午10:02:46<br>
 * @version v1.0
 *
 */
public interface CustomMapper<T> extends Mapper<T>, MySqlMapper<T> {

    /**
     * 查询集合
     * @param entity
     * @return
     */
    public List<T> findList(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(T entity);

    /**
     * 删除数据（逻辑删除，更新del_flag字段为1,在表包含字段del_flag时，可以调用此方法，将数据隐藏）
     * @param id
     * @return
     */
    public int deleteByLogic(String id);

}
