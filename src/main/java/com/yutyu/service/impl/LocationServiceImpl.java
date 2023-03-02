package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Location;
import com.yutyu.service.LocationService;
import com.yutyu.mapper.LocationMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【location】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location>
    implements LocationService{

}




