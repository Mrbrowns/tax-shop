package com.yhsoft.api.mapper;
import com.yhsoft.api.entity.SysMenu;
import com.yhsoft.api.entity.SysMenuTree;
import com.yhsoft.framework.core.persistence.annotation.MyBatisDao;

import java.util.List;

@MyBatisDao
public interface SysMenuMapper {
	/**
	 * 获得SysMenu数据的总行数
	 * @return
	 */
    long getSysMenuRowCount();
	/**
	 * 获得SysMenu数据集合
	 * @return
	 */
    List<SysMenu> selectSysMenu();
	/**
	 * 获得一个SysMenu对象,以参数SysMenu对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysMenu selectSysMenuByObj(SysMenu obj);
	/**
	 * 通过SysMenu的id获得SysMenu对象
	 * @param id
	 * @return
	 */
    SysMenu selectSysMenuById(Integer id);
	/**
	 * 插入SysMenu到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysMenu(SysMenu value);
	/**
	 * 插入SysMenu中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysMenu(SysMenu value);
	/**
	 * 批量插入SysMenu到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysMenuByBatch(List<SysMenu> value);
	/**
	 * 通过SysMenu的id删除SysMenu
	 * @param id
	 * @return
	 */
    int deleteSysMenuById(Integer id);
	/**
	 * 通过SysMenu的id更新SysMenu中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysMenuById(SysMenu enti);
	/**
	 * 通过SysMenu的id更新SysMenu中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysMenuById(SysMenu enti);

    /***
	 *　获取菜单树
	 * **/
    List<SysMenuTree> queryTreeList();
}