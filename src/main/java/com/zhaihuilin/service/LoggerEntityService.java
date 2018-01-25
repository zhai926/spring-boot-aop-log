package com.zhaihuilin.service;

import com.zhaihuilin.entity.LoggerEntity;

import java.util.List;

/**
 * Created by zhaihuilin on 2018/1/18  13:56.
 */
public interface LoggerEntityService {

    public LoggerEntity saveLoggerEntity(LoggerEntity loggerEntity);

    public List<LoggerEntity> findAll();

    public LoggerEntity updateLoggerEntity(LoggerEntity loggerEntity);
}
