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
        List<String> type = nodeDao.findDistinct();
        for (String s : type) {
            NodeResult nodeResult = new NodeResult(s);
            nodeResult.setData(nodeDao.findByType(s));
            list.add(nodeResult);
        }
        return list;
    }
}
