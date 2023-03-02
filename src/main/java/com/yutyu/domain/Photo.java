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
 * @TableName photo
 */
@TableName(value ="photo")
@Data
public class Photo implements Serializable {
    /**
     * 图集id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 作者
     */
    private String author;

    /**
     * 图集标题
     */
    private String title;

    /**
     * 图集链接（url的id，数组）
     */
    private Integer url;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 点赞数量
     */
    private Integer zanCount;

    /**
     * 观看数量
     */
    private Integer readCount;

    /**
     * 图集描述
     */
    private String content;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}