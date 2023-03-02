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
 * @TableName video
 */
@TableName(value ="video")
@Data
public class Video implements Serializable {
    /**
     * 视频id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 作者
     */
    private String author;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频链接(url的id)
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
     * 播放数量
     */
    private Integer readCount;

    /**
     * 视频描述
     */
    private String content;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}