package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Video;
import com.yutyu.service.VideoService;
import com.yutyu.mapper.VideoMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【video】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{

}




