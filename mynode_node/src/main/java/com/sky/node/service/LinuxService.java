package com.sky.node.service;

import com.sky.node.dao.LinuxDao;
import com.sky.node.dto.NodeResult;
import com.sky.node.pojo.Linux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinuxService {
    private final LinuxDao linuxDao;

    @Autowired
    public LinuxService(LinuxDao linuxDao) {
        this.linuxDao = linuxDao;
    }

    public List<NodeResult> findAll() {
        List<NodeResult> list = new ArrayList<NodeResult>();
        List<String> data = linuxDao.findDistinct();
        for (String s : data) {
            NodeResult<List<Linux>> nodeNodeResult = new NodeResult<List<Linux>>(s);
            nodeNodeResult.setData(linuxDao.findByType(s));
            list.add(nodeNodeResult);
        }
        return list;
    }
}
