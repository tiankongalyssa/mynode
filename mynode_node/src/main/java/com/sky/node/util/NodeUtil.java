package com.sky.node.util;

import entity.Result;
import entity.StatusCode;

public class NodeUtil {

    public static Result ResultSueescc(Object o) {
        return new Result(true, StatusCode.OK, "success",o);
    }
    public static Result ResultSueescc() {
        return new Result(true, StatusCode.OK, "success");
    }
}
