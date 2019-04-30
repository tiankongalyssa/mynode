package com.sky.node.dao;

import com.sky.node.pojo.Linux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Node数据访问接口
 * @author Administrator
 *
 */
public interface LinuxDao extends JpaRepository<Linux,Integer>,JpaSpecificationExecutor<Linux>{
    @Query(value = "select distinct type from tb_linux_command",nativeQuery = true)
    List<String> findDistinct();

    List<Linux> findByType(String type);
}
