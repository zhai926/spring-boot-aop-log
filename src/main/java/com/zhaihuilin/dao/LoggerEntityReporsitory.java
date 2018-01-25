package com.zhaihuilin.dao;

import com.zhaihuilin.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaihuilin on 2018/1/18  13:56.
 */
@Repository
public interface LoggerEntityReporsitory extends JpaRepository<LoggerEntity,Long> {
}
