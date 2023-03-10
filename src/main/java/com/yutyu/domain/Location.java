package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName location
 */
@TableName(value ="location")
@Data
public class Location implements Serializable {
    /**
     * 位置id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 位置名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}