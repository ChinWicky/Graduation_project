package scau.graduationProject.CSA.service;

import scau.graduationProject.CSA.mapper.UserMapper;
import scau.graduationProject.CSA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
