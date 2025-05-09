package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //SpringContext를 사용하겠다
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){ //create, read, update, delete
        userRepository.save(new Users()); //테이블에 저장하겠다는 의미

        userRepository.findAll().forEach(System.out::println);


    }

}