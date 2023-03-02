package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Comment;
import com.yutyu.service.CommentService;
import com.yutyu.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




