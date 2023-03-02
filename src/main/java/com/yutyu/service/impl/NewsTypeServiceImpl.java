package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.NewsType;
import com.yutyu.service.NewsTypeService;
import com.yutyu.mapper.NewsTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class NewsTypeServiceImpl extends ServiceImpl<NewsTypeMapper, NewsType>
    implements NewsTypeService{

}




