package com.example.providerticket.Service;

import com.example.providerticket.Dao.UserDao;
import com.example.providerticket.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Map<String,Object> getUserById(String userId){
        Map<String,Object> map = new HashMap<>();
        User user = userDao.getUser(userId);
        if (user == null){
            map.put("code",2);
            map.put("data",null);
        }else {
            map.put("code",1);
            map.put("data",user);
        }
        return map;
    }

}
