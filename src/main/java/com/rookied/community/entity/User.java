package com.rookied.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author rookied
 * @date 2022.04.21
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type; //  '0-普通用户; 1-超级管理员; 2-版主;'
    private int status; // '0-未激活; 1-已激活;',
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
