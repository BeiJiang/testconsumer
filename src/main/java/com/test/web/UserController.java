package com.test.web;

import com.test.api.dto.UserDTO;
import com.test.dubbo.consumer.UserDubboConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author liushaohua
 * @date 2018/4/3
 */
@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    private UserDubboConsumer userDubboConsumer;


    @RequestMapping(value = "getUser.json", method = RequestMethod.GET)
    @ResponseBody
    public UserDTO getUserById(@RequestParam(name = "id") Long id){
        try {
            return userDubboConsumer.getUserByUserId(id);
        }catch (Exception e){
           e.printStackTrace();
        }
        return null;
    }
}
