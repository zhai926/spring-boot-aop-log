package com.zhaihuilin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 日志实体
 * Created by zhaihuilin on 2018/1/18  13:39.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoggerEntity implements Serializable {

    @Id
    @GenericGenerator(name = "sys_uid",strategy = "com.zhaihuilin.utils.KeyGeneratorUtils",parameters = {
            @Parameter(name = "k",value = "L")
    })
    @GeneratedValue(generator = "sys_uid")
    private  String  id;
    //客户端请求ip
    private String clientIp;
    //客户端请求路径
    private String uri;
    //终端请求方式,普通请求,ajax请求
    private String type;
    //请求方式method,post,get等
    private String method;
    //请求的类及方法
    private String classMethod;
    //请求参数内容,json
    private String paramData;
    //请求接口唯一session标识
    private String sessionId;
    //请求时间
    private long time;
    //接口返回时间
    private String returnTime;
    //接口返回数据json
    private String returnData;
    //请求时httpStatusCode代码，如：200,400,404等
    private String httpStatusCode;
    //请求耗时秒单位
    private int timeConsuming;
    //异常描述
    private String exceptionMessage;
    //请求开始时间
    private long startTime;
    //请求结束时间
    private long endTime;

    public LoggerEntity(String clientIp, String uri, String type, String method, String classMethod, String paramData, String sessionId, long time, String returnTime, String returnData, String httpStatusCode, int timeConsuming, String exceptionMessage, long startTime, long endTime) {
        this.clientIp = clientIp;
        this.uri = uri;
        this.type = type;
        this.method = method;
        this.classMethod = classMethod;
        this.paramData = paramData;
        this.sessionId = sessionId;
        this.time = time;
        this.returnTime = returnTime;
        this.returnData = returnData;
        this.httpStatusCode = httpStatusCode;
        this.timeConsuming = timeConsuming;
        this.exceptionMessage = exceptionMessage;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
