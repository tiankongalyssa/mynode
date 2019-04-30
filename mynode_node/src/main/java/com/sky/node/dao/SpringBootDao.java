package com.sky.node.dao;

import com.sky.node.pojo.SpringBoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SpringBoot数据访问接口
 * @author Administrator
 *
 */
public interface SpringBootDao extends JpaRepository<SpringBoot,Integer>,JpaSpecificationExecutor<SpringBoot>{

}
