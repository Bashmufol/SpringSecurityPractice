package com.bash.springsecex.service;

import com.bash.springsecex.model.Users;
import com.bash.springsecex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public Users register(Users user) {
        return repo.save(user);
    }
}
