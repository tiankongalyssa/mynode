package com.sky.node.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "tb_linux_command")
public class Linux extends BaseEntity {
    @Id
    protected Integer id;
    protected String type;
    protected String function;
    protected String command;


    @Override
    public String toString() {
        return "Linux{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", function='" + function + '\'' +
                ", command='" + command + '\'' +
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
