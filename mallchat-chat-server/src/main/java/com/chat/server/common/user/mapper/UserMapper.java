package com.chat.server.common.user.mapper;

import com.chat.server.common.user.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author break
 * @since 2024-09-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
