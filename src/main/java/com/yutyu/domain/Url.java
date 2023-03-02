package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName url
 */
@TableName(value ="url")
@Data
public class Url implements Serializable {
    /**
     * url的ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * url的路径
     */
    private String path;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}