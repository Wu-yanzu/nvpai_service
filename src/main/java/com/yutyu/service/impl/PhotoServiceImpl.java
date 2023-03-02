package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Photo;
import com.yutyu.service.PhotoService;
import com.yutyu.mapper.PhotoMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【photo】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo>
    implements PhotoService{

}




