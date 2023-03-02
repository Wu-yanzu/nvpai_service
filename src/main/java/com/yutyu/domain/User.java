package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户头像(url的id)
     */
    private Integer avatar;

    /**
     * 性别（1-男，2-女）
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 禁言（0-否、1-是）
     */
    private Integer jinyan;

    /**
     * 凤凰（0-否、1-是）
     */
    private Integer fenghao;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}