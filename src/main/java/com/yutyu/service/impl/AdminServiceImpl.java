package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Admin;
import com.yutyu.service.AdminService;
import com.yutyu.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




