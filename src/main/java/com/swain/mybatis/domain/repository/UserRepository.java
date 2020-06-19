package com.swain.mybatis.domain.repository;

import com.swain.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserRepository {
    User Sel(@Param("id") int id);
}
