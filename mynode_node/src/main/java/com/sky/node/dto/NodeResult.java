package com.sky.node.dto;

import com.sky.node.pojo.Node;

import java.util.List;

public class NodeResult {
    private String type;
    private List<Node> data;

    public NodeResult(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NodeResult{" +
                "type='" + type + '\'' +
                ", data=" + data +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Node> getData() {
        return data;
    }

    public void setData(List<Node> data) {
        this.data = data;
    }
}
