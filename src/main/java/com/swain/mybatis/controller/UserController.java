package com.swain.mybatis.controller;

import com.swain.mybatis.domain.query.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private QueryService queryService;

    @RequestMapping("get_user_info/{id}")
    public String GetUserInfo(@PathVariable int id) {
        return queryService.Sel(id).toString();
    }
}
