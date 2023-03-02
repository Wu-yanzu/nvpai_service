package com.yutyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutyu.domain.Member;
import com.yutyu.service.MemberService;
import com.yutyu.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author 魔鬼筋肉人
* @description 针对表【member】的数据库操作Service实现
* @createDate 2023-03-02 22:43:55
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




