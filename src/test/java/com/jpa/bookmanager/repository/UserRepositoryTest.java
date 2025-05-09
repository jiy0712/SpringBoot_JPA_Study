package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.Users;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //SpringContext를 사용하겠다
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud(){ //create, read, update, delete
        Optional<Users> user = Optional.ofNullable(userRepository.findById(1L).orElse(null));
        //Users user = userRepository.getOne(1L);
        System.out.println(user);
    }

}