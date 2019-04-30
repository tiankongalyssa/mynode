package com.sky.node.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "tb_node")
public class Node extends BaseEntity{
    @Id
    private Integer id ;
    @JsonIgnore
    private String type;
    private String title;
    private Integer state;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;
    private Integer index;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", state=" + state +
                ", url='" + url + '\'' +
                ", index=" + index +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", modofiedTime=" + modofiedTime +
                ", modofiedUser='" + modofiedUser + '\'' +
                '}';
    }
}
