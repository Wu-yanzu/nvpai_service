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
 * @TableName member
 */
@TableName(value ="member")
@Data
public class Member implements Serializable {
    /**
     * 队员id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身高
     */
    private Double height;

    /**
     * 体重
     */
    private Double weigth;

    /**
     * 位置
     */
    private Integer location;

    /**
     * 扣球数量
     */
    private Integer kouqiu;

    /**
     * 篮网数量
     */
    private Integer lanwang;

    /**
     * 发球数量
     */
    private Integer faqiu;

    /**
     * 职务
     */
    private Integer jobId;

    /**
     * 隶属俱乐部
     */
    private Integer clubId;

    /**
     * 队员图片
     */
    private Integer photo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 号码
     */
    private Integer number;

    /**
     * 背衫名
     */
    private String backing;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}