package com.sky.node.dto;

public class Info {
    private String typeName;
    private String name;
    private Integer sort;
    private String summary;
    private Integer step;

    @Override
    public String toString() {
        return "Info{" +
                "typeName='" + typeName + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", summary='" + summary + '\'' +
                ", step=" + step +
                '}';
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }
}
