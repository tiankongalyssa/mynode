package com.sky.node.controller;

import com.sky.node.service.LinuxService;
import com.sky.node.service.NodeService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/node")
@CrossOrigin
public class NodeController {
    private final NodeService nodeService;

    private final LinuxService linuxService;

    @Autowired
    public NodeController(NodeService nodeService, LinuxService linuxService) {
        this.nodeService = nodeService;
        this.linuxService = linuxService;
    }

    @GetMapping
    public Result findAllNode() {
        return new Result(true, StatusCode.OK, "查询成功", nodeService.findAll());
    }

    @GetMapping("/linux")
    public Result findAllLinux() {
        return new Result(true, StatusCode.OK, "查询成功", linuxService.findAll());
    }
}
