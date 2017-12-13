package com.yhsoft.api.controller;

import com.yhsoft.api.service.IndexService;
import com.yhsoft.util.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="后台首页相关的接口")
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    /**
     * 获取统计信息
     */
    @RequestMapping("/")
    @ApiOperation(notes="获取统计信息",value="获取统计信息",httpMethod="GET")
    @ApiImplicitParam(name = "/", value = "获取统计信息", required = true)
    public ResponseEntity index(){
        ResponseEntity entity = new ResponseEntity();
        entity.success(indexService.getStatisticsInfo(),"获取成功");
        return entity;
    }
}
