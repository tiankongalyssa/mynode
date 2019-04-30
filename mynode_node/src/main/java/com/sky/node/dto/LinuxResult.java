package com.sky.node.dto;

import com.sky.node.pojo.Linux;

import java.util.List;

public class LinuxResult {
    private String type;
    private List<Linux> data;

    public String getType() {
        return type;
    }

    public LinuxResult(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Linux> getData() {
        return data;
    }

    public void setDatas(List<Linux> datas) {
        this.data = datas;
    }

    @Override
    public String toString() {
        return "LinuxResult{" +
                "type='" + type + '\'' +
                ", datas=" + data +
                '}';
    }
}
