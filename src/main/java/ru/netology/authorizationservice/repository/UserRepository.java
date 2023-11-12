package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.enums.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> listAuthorities = new ArrayList<>();
        Map<String, String> mapUsers = new HashMap<>();
        mapUsers.put("kostya", "z1z2x3");
        mapUsers.put("zina", "1234");
        mapUsers.put("Anton", "1111");

        if (mapUsers.containsKey(user) && mapUsers.get(user).equals(password)) {
            listAuthorities.add(Authorities.WRITE);
        }
        return listAuthorities;
    }
}

