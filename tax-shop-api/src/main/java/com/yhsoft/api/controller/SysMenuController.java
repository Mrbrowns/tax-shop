package com.yhsoft.api.controller;

import com.yhsoft.api.service.SysMenuService;
import com.yhsoft.util.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="菜单管理相关的接口")
@RestController
@RequestMapping("/menu")
public class SysMenuController {
    @Autowired
    private SysMenuService service;


    /**
     * 获取菜单列表
     */
    @RequestMapping("/list")
    @ApiOperation(notes="获取菜单列表",value="获取菜单列表",httpMethod="GET")
    @ApiImplicitParam( required = true)
    public ResponseEntity queryTreeList(){
        ResponseEntity entity = new ResponseEntity();
        entity.success(service.queryTreeList(),"获取成功");
        return entity;
    }
}
