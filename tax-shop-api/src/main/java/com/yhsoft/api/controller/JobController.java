package com.yhsoft.api.controller;

import com.yhsoft.api.entity.Job;
import com.yhsoft.api.service.JobService;
import com.yhsoft.util.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="用户部门相关的接口")
@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService service;

    /**
     * 添加部门
     * @param job 部门
     */
    @RequestMapping("/add")
    @ApiOperation(notes="添加部门",value="添加一个部门",httpMethod="POST")
    @ApiImplicitParam(name = "job", value = "部门实体job", required = true, dataType = "Job")
    public String add(@RequestBody Job job){
        return "hello "+service.insertJob(job);
    }


    /**
     * 查询部门
     * @param id 部门ID
     */
    @RequestMapping("/get/{id}")
    @ApiOperation(notes="查询部门",value="查询一个部门",httpMethod="GET")
    @ApiImplicitParam(name = "id", value = "查询部门实体job", required = true, dataType = "Long")
    public ResponseEntity getById(@PathVariable Long id){
        ResponseEntity entity = new ResponseEntity();
        entity.success(service.selectJobById(id),"获取成功");
        return entity;
    }
}
