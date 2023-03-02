package com.yutyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    /**
     * 评论id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 评论类型（0-新闻 、1-视频、2-图集）
     */
    private Integer commentType;

    /**
     * 评论所对应分类的ID
     */
    private Integer commentId;

    /**
     * 用户的id
     */
    private Integer userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}