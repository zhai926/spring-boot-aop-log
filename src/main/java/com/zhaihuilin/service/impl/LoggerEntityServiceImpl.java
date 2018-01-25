package com.zhaihuilin.service.impl;

import com.zhaihuilin.dao.LoggerEntityReporsitory;
import com.zhaihuilin.entity.LoggerEntity;
import com.zhaihuilin.service.LoggerEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/1/18  13:57.
 */
@Transactional
@Service
public class LoggerEntityServiceImpl implements LoggerEntityService {

    @Autowired
    private LoggerEntityReporsitory loggerEntityReporsitory;
    @Override
    public LoggerEntity saveLoggerEntity(LoggerEntity loggerEntity) {
        return loggerEntityReporsitory.save(loggerEntity);
    }

    @Override
    public List<LoggerEntity> findAll() {
        return loggerEntityReporsitory.findAll();
    }

    @Override
    public LoggerEntity updateLoggerEntity(LoggerEntity loggerEntity) {
        return loggerEntityReporsitory.save(loggerEntity);
    }
}
