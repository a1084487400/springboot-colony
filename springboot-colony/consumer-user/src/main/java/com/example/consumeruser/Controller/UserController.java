package com.example.consumeruser.Controller;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getUser")
    public Map<String,Object> getUser (String userId){
        Map<String,Object> reuqestMap = Maps.newHashMap();
        reuqestMap.put("userId",userId);
        String url = "http://PROVIDER-TICKET/getUser?userId={userId}";
        Map<String,Object> map = restTemplate.getForObject(url,Map.class,reuqestMap);
        return map;
    }

}
