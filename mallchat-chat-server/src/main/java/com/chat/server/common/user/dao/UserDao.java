package com.chat.server.common.user.dao;

import com.chat.server.common.user.domain.entity.User;
import com.chat.server.common.user.mapper.UserMapper;
import com.chat.server.common.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author break
 * @since 2024-09-26
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User>{

}
