package com.yhsoft.api.entity;

import java.util.List;

/**
 *
 * 权限树接参用实体
 * **/
public class SysMenuTree {

    private String label;
    private String id;
    private String menuUrl;
    private List<SysMenuTree> children;

    public List<SysMenuTree> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuTree> children) {
        this.children = children;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}
