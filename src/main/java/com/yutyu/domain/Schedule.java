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
 * @TableName schedule
 */
@TableName(value ="schedule")
@Data
public class Schedule implements Serializable {
    /**
     * 赛程id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 比赛城市
     */
    private String city;

    /**
     * 对手
     */
    private String team;

    /**
     * 比赛时间
     */
    private Date time;

    /**
     * 中国得分
     */
    private Integer result1;

    /**
     * 他国得分
     */
    private Integer result2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}