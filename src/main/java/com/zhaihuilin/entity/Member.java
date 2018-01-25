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
 * Created by zhaihuilin on 2018/1/18  14:20.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member implements Serializable {

    @Id
    @GenericGenerator(name = "sys_uid",strategy = "com.zhaihuilin.utils.KeyGeneratorUtils",parameters = {
            @Parameter(name = "k",value = "M")
    })
    @GeneratedValue(generator = "sys_uid")
    public  String   id;

    public  String   name;

    public  String   password;

    public  int age;
}
