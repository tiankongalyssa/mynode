package com.sky.node.dao;

import com.sky.node.pojo.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Step数据访问接口
 *
 * @author Administrator
 */
public interface StepDao extends JpaRepository<Step, Integer>, JpaSpecificationExecutor<Step> {
    List<Step> findByPid(Integer pid);
}
