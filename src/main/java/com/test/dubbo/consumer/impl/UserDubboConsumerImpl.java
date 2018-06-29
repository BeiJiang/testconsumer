package com.test.dubbo.consumer.impl;

import com.test.api.dto.UserDTO;
import com.test.api.service.UserDubboService;
import com.test.dubbo.consumer.UserDubboConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author liushaohua
 * @date 2018/6/27
 */
@Service
public class UserDubboConsumerImpl implements UserDubboConsumer {

    @Autowired
    private UserDubboService userDubboService;

    @Override
    public UserDTO getUserByUserId(Long id) {
        return userDubboService.getUserByUserId(id);
    }
}
