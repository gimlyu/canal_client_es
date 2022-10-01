package com.example.canal_client_es.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.canal_client_es.entity.User;
import com.example.canal_client_es.mapper.UserMapper;
import com.example.canal_client_es.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author benjamin_5
 * @Description
 * @date 2022/10/1
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
