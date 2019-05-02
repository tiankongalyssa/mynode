package com.sky.node.service;

import com.sky.node.dao.SpringBootDao;
import com.sky.node.dao.StepDao;
import com.sky.node.dto.NodeResult;
import com.sky.node.pojo.SpringBoot;
import com.sky.node.pojo.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SpringBootService {
    private final SpringBootDao springBootDao;
    private final StepDao stepDao;

    @Autowired
    public SpringBootService(SpringBootDao springBootDao, StepDao stepDao) {
        this.springBootDao = springBootDao;
        this.stepDao = stepDao;
    }

    public List<NodeResult<List<SpringBoot>>> findAll() {
        List<NodeResult<List<SpringBoot>>> list = new ArrayList<NodeResult<List<SpringBoot>>>();
        //查询所有类型
        List<String> type = springBootDao.findDistinct();
        for (String s : type) {
            NodeResult<List<SpringBoot>> nodeResult = new NodeResult<List<SpringBoot>>(s);
            //查询每种类型下的所有
            List<SpringBoot> springBootList = springBootDao.findByTypeName(s);
            //查询每个具体知识点的实现步骤
            for (SpringBoot springBoot : springBootList) {
                if(springBoot.getStep() == null){
                    throw new RuntimeException("step为null");
                }
                //判断如果有步骤则查询
                if (springBoot.getStep() != null || !"".endsWith(springBoot.getStep())) {
                    springBoot.setSteps(stepDao.findByPid(springBoot.getId()));
                }
            }
            nodeResult.setData(springBootList);
            list.add(nodeResult);
        }
        return list;
    }

    public void save(SpringBoot springBoot, List<Step> list) {
        if (springBoot.getTypeName()==null){
            throw new RuntimeException("数据为空");
        }
        //保存springboot
        Date date = new Date();
        springBoot.setCreateTime(date);
        springBoot.setModofiedTime(date);
        String user = "sky";
        springBoot.setCreateUser(user);
        springBoot.setModofiedUser(user);
        Integer maxSort = springBootDao.findMaxSortByType(springBoot.getTypeName());
        springBoot.setSort(maxSort == null ? 100 : maxSort + 100);
        SpringBoot save = springBootDao.save(springBoot);
        //保存step
        for (Step step : list) {
            step.setPid(save.getId());
            step.setPname(save.getName());
            step.setCreateTime(date);
            step.setModofiedTime(date);
            step.setCreateUser(user);
            step.setModofiedUser(user);
        }
        stepDao.saveAll(list);
    }

    public SpringBoot findById(Integer id) {
        SpringBoot springBoot = springBootDao.findById(id).get();
        springBoot.setSteps(stepDao.findByPid(springBoot.getId()));
        System.out.println(springBoot);
        return springBoot;
    }
}
