package com.test.dubbo.consumer;


import com.test.api.dto.UserDTO;

/**
 * Created by liushaohua on 2018/6/25.
 */
public interface UserDubboConsumer {
    /**
     * 根据用户ID获取用户信息
     * @param id
     * @return
     */
    UserDTO getUserByUserId(Long id);
}
