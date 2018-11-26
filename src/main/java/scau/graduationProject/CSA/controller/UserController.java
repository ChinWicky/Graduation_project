package scau.graduationProject.CSA.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scau.graduationProject.CSA.Application;
import scau.graduationProject.CSA.entity.User;
import scau.graduationProject.CSA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }
}
