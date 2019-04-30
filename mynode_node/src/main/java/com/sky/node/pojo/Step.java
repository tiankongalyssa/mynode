package com.sky.node.pojo;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "tb_step")
public class Step extends BaseEntity{
    @Id
    private Integer id;
    private Integer pid;
    private String pname;
    private Integer step;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", step=" + step +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
