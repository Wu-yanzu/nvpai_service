package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName job
 */
@TableName(value ="job")
@Data
public class Job implements Serializable {
    /**
     * 职务id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 职务名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}