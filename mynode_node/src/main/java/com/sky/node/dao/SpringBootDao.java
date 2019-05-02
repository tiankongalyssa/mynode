package com.sky.node.dao;

import com.sky.node.pojo.SpringBoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * SpringBoot数据访问接口
 *
 * @author Administrator
 */
public interface SpringBootDao extends JpaRepository<SpringBoot, Integer>, JpaSpecificationExecutor<SpringBoot> {

    @Query(value = "select distinct type_name from tb_springboot ", nativeQuery = true)
    List<String> findDistinct();

    List<SpringBoot> findByTypeName(String type);
    @Query(value = "SELECT MAX(sort) from tb_springboot WHERE type_name=?",nativeQuery = true)
    Integer findMaxSortByType(String type);
}
