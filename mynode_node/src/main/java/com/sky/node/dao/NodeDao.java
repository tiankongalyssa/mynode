package com.sky.node.dao;

import com.sky.node.pojo.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Node数据访问接口
 * @author Administrator
 *
 */
public interface NodeDao extends JpaRepository<Node,Integer>,JpaSpecificationExecutor<Node>{
    @Query(value = "select distinct type from tb_node ",nativeQuery = true)
    List<String> findDistinct();
    List<Node> findByType(String type);
}
