package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName news_type
 */
@TableName(value ="news_type")
@Data
public class NewsType implements Serializable {
    /**
     * 新闻分类id
     */
    @TableId
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}