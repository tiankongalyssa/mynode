package com.sky.node.service;

import com.sky.node.dao.LinuxDao;
import com.sky.node.dto.LinuxResult;
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

    public List<String> findDistinect() {
        return linuxDao.findDistinct();
    }

    public List<LinuxResult> findAll() {
        List<LinuxResult> list = new ArrayList<LinuxResult>();
        List<String> data = linuxDao.findDistinct();
        for (String l : data) {
            LinuxResult linuxResult = new LinuxResult(l);
            linuxResult.setDatas(linuxDao.findByType(l));
            list.add(linuxResult);
        }
        return list;
    }
}
