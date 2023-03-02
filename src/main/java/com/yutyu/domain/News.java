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
 * @TableName news
 */
@TableName(value ="news")
@Data
public class News implements Serializable {
    /**
     * 新闻id
     */
    @TableId
    private Integer id;

    /**
     * 新闻分类id
     */
    private Integer newsTypeId;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻图片(url的id)
     */
    private Integer image;

    /**
     * 是否发布（0-否、1-是）
     */
    private Integer isPublished;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 发布时间
     */
    private Date fabuTime;

    /**
     * 点赞数量
     */
    private Integer zanCount;

    /**
     * 阅读数量
     */
    private Integer readCount;

    /**
     * 作者
     */
    private String author;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}