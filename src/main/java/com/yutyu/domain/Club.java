package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName club
 */
@TableName(value ="club")
@Data
public class Club implements Serializable {
    /**
     * 俱乐部id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 俱乐部名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}