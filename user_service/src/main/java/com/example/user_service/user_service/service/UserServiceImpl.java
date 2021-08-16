package com.example.user_service.user_service.service;

import com.example.user_service.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    // fake user list

    List<User> list= List.of(
            new User(1311L, "Shobhit", "943432432"),
            new User(1312L, "Samraat", "843432432"),
            new User(1313L, "Sanjana", "743432432"),
            new User(1314L, "Rohit", "643432432")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null
        );
    }
}
