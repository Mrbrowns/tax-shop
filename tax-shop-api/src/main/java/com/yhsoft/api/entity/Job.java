package com.yhsoft.api.entity;

public class Job {
    private Integer id;
    private Integer departmentId;
    private String name;
    private String description;
    private Double allowance;
    private Integer limitEmployee;
    public Job() {
        super();
    }
    public Job(Integer id,Integer departmentId,String name,String description,Double allowance,Integer limitEmployee) {
        super();
        this.id = id;
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
        this.allowance = allowance;
        this.limitEmployee = limitEmployee;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAllowance() {
        return this.allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Integer getLimitEmployee() {
        return this.limitEmployee;
    }

    public void setLimitEmployee(Integer limitEmployee) {
        this.limitEmployee = limitEmployee;
    }

}
