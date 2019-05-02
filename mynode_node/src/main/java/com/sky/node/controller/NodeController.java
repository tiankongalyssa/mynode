package com.sky.node.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sky.node.dto.Info;
import com.sky.node.pojo.SpringBoot;
import com.sky.node.pojo.Step;
import com.sky.node.service.LinuxService;
import com.sky.node.service.NodeService;
import com.sky.node.service.SpringBootService;
import com.sky.node.util.NodeUtil;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/node")
@CrossOrigin
public class NodeController {
    private final NodeService nodeService;

    private final LinuxService linuxService;
    private final SpringBootService springBootService;

    @Autowired
    public NodeController(NodeService nodeService, LinuxService linuxService, SpringBootService springBootService) {
        this.nodeService = nodeService;
        this.linuxService = linuxService;
        this.springBootService = springBootService;
    }

    @GetMapping
    public Result findAllNode() {
        return NodeUtil.ResultSueescc(nodeService.findAll());
    }

    @GetMapping("/linux")
    public Result findAllLinux() {
        return NodeUtil.ResultSueescc(linuxService.findAll());
    }

    @GetMapping("/springboot")
    public Result findAllSpringBoot() {
        return NodeUtil.ResultSueescc(springBootService.findAll());
    }

    @PutMapping("/springboot")
    public Result save(@RequestBody Map map) {
        SpringBoot springBoot = JSON.parseObject(map.get("info").toString(), SpringBoot.class);
        List<Step> list = JSONArray.parseArray(map.get("step").toString(), Step.class);
        springBootService.save(springBoot, list);
        return NodeUtil.ResultSueescc();
    }
    @GetMapping("/springboot/{id}")
    public Result findSpringBootById(@PathVariable Integer id){
       return NodeUtil.ResultSueescc(springBootService.findById(id));
    }
}
