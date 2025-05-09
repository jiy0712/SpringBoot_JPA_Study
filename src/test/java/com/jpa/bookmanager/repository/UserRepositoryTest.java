package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.Users;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //SpringContext를 사용하겠다
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){ //create, read, update, delete
        Users user1 = new Users("jack", "jack@gmail.com");
        Users user2 = new Users("jack2", "jack2@gmail.com");

        userRepository.saveAll(Lists.newArrayList(user1,user2));
        //userRepository.save(user1);

        List<Users> users = userRepository.findAll();
        users.forEach(System.out::println);

        //List<Users> users = userRepository.findAllById(findAll(Sort.by(Sort.Direction.DESC,"name"));
        //List<Users> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
    }

}