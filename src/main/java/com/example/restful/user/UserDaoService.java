package com.example.restful.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();


    private static Long userCount = 3L;

    static {
        users.add(new User(1L,"userA","asd@adsd1.com",new Date(),new Date()));
        users.add(new User(2L,"userB","asd@adsd2.com",new Date(),new Date()));
        users.add(new User(3L,"userC","asd@adsd3.com",new Date(),new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }

        users.add(user);
        return user;
    }


    public User findOne(long id) {
        for(User user: users){
            if(user.getId()== id){
                return user;
            }
        }
        return null;
    }

}
