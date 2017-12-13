package com.yhsoft.api.service.Impl;
import java.util.List;
import com.yhsoft.api.mapper.JobMapper;
import com.yhsoft.api.entity.Job;
import com.yhsoft.api.common.Assist;
import com.yhsoft.api.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JobServiceImpl implements JobService{
    @Autowired
    private JobMapper jobMapper;
    @Override
    public long getJobRowCount(Assist assist){
        return jobMapper.getJobRowCount(assist);
    }
    @Override
    public List<Job> selectJob(Assist assist){
        return jobMapper.selectJob(assist);
    }
    @Override
    public Job selectJobByObj(Job obj){
        return jobMapper.selectJobByObj(obj);
    }
    @Override
    public Job selectJobById(Long id){
        return jobMapper.selectJobById(id);
    }
    @Override
    public int insertJob(Job value){
        return jobMapper.insertJob(value);
    }
    @Override
    public int insertNonEmptyJob(Job value){
        return jobMapper.insertNonEmptyJob(value);
    }
    @Override
    public int insertJobByBatch(List<Job> value){
        return jobMapper.insertJobByBatch(value);
    }
    @Override
    public int deleteJobById(Long id){
        return jobMapper.deleteJobById(id);
    }
    @Override
    public int deleteJob(Assist assist){
        return jobMapper.deleteJob(assist);
    }
    @Override
    public int updateJobById(Job enti){
        return jobMapper.updateJobById(enti);
    }
    @Override
    public int updateJob(Job value, Assist assist){
        return jobMapper.updateJob(value,assist);
    }
    @Override
    public int updateNonEmptyJobById(Job enti){
        return jobMapper.updateNonEmptyJobById(enti);
    }
    @Override
    public int updateNonEmptyJob(Job value, Assist assist){
        return jobMapper.updateNonEmptyJob(value,assist);
    }


}