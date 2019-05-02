package com.sky.node.pojo;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tb_springboot")
public class SpringBoot extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String typeName;
    private String name;
    private Integer sort;
    private String step;
    private String summary;

    @Override
    public String toString() {
        return "SpringBoot{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", step='" + step + '\'' +
                ", summary='" + summary + '\'' +
                ", steps=" + steps +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", modofiedTime=" + modofiedTime +
                ", modofiedUser='" + modofiedUser + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    @Transient
    private List<Step> steps;

}
