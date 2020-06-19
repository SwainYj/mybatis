package com.swain.mybatis.domain.query.impl;

import com.swain.mybatis.domain.query.QueryService;
import com.swain.mybatis.domain.repository.UserRepository;
import com.swain.mybatis.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class QueryServiceImpl implements QueryService {

    @Resource
    UserRepository userRepository;

    public User Sel(int id){
        return userRepository.Sel(id);
    }
}
