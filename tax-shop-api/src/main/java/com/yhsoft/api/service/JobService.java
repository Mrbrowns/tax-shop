package com.yhsoft.api.service;
import java.util.List;
import com.yhsoft.api.entity.Job;
import com.yhsoft.api.common.Assist;
public interface JobService{
	/**
	 * 获得Job数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getJobRowCount(Assist assist);
	/**
	 * 获得Job数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Job> selectJob(Assist assist);
	/**
	 * 获得一个Job对象,以参数Job对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Job selectJobByObj(Job obj);
	/**
	 * 通过Job的id获得Job对象
	 * @param id
	 * @return
	 */
    Job selectJobById(Long id);
	/**
	 * 插入Job到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertJob(Job value);
	/**
	 * 插入Job中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyJob(Job value);
	/**
	 * 批量插入Job到数据库
	 * @param value
	 * @return
	 */
    int insertJobByBatch(List<Job> value);
	/**
	 * 通过Job的id删除Job
	 * @param id
	 * @return
	 */
    int deleteJobById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除Job
	 * @param assist
	 * @return
	 */
    int deleteJob(Assist assist);
	/**
	 * 通过Job的id更新Job中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateJobById(Job enti);
 	/**
	 * 通过辅助工具Assist的条件更新Job中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateJob(Job value,  Assist assist);
	/**
	 * 通过Job的id更新Job中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyJobById(Job enti);
 	/**
	 * 通过辅助工具Assist的条件更新Job中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyJob(Job value, Assist assist);
}