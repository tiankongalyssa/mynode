package com.sky.node.pojo;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

@Entity(name = "tb_springboot")
public class SpringBoot extends BaseEntity{
    @Id
    private Integer id;
    private String type;
    private String name;
    private Integer index;
    private String step;
    private String summary;
    @Transient
    private List<Step> steps;

    @Override
    public String toString() {
        return "SpringBoot{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", index=" + index +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
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
}
