package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Job;
import com.yutyu.service.JobService;
import com.yutyu.mapper.JobMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【job】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job>
    implements JobService{

}




