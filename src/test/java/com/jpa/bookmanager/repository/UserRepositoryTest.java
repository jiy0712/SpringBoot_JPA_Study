package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
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
        userRepository.save(new User()); //테이블에 저장하겠다는 의미

        System.out.println(">>>" + userRepository.findAll()); //유저라는 모든 데이터를 리스트 형태로
    }

}