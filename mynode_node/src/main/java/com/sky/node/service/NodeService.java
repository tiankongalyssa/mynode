package com.sky.node.service;

import com.sky.node.dao.NodeDao;
import com.sky.node.dto.NodeResult;
import com.sky.node.pojo.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NodeService {
    private final NodeDao nodeDao;

    @Autowired
    public NodeService(NodeDao nodeDao) {
        this.nodeDao = nodeDao;
    }


    public List<NodeResult> findAll() {
        List<NodeResult> list = new ArrayList<NodeResult>();
        List<String> data = nodeDao.findDistinct();
        for (String s : data) {
            NodeResult<List<Node>> nodeNodeResult = new NodeResult<List<Node>>(s);
            nodeNodeResult.setData(nodeDao.findByType(s));
            list.add(nodeNodeResult);
        }
        return list;
    }
}
