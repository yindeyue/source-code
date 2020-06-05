package org.example;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserQuery implements GraphQLQueryResolver {
    private static Map<Integer,User> userMap=new HashMap<>();
    static{
        userMap.put(1,new User(1,"admin","password",18));
        userMap.put(2,new User(2,"admin2","password2",21));
        userMap.put(3,new User(3,"admin3","password3",23));
    }
    public User getUserById(Integer id){
        return userMap.get(id);
    }
    public List<User> listUser(){
        return new ArrayList<>(userMap.values());
    }
}
