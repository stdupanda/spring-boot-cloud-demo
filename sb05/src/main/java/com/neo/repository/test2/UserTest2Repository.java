package com.neo.repository.test2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.domain.User;

public interface UserTest2Repository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}