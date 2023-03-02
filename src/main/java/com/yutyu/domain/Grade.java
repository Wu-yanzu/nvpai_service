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
 * @TableName grade
 */
@TableName(value ="grade")
@Data
public class Grade implements Serializable {
    /**
     * 比赛id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 比赛日期
     */
    private Date year;

    /**
     * 名次（0未参赛）
     */
    private Integer ranking;

    /**
     * 举办国家
     */
    private String state;

    /**
     * 分类id
     */
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}