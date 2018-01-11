package com.neo.repository.test1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.domain.User;

public interface UserTest1Repository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}