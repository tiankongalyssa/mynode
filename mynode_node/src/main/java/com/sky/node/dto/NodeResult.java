package com.sky.node.dto;

public class NodeResult<T> {
    private String type;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
