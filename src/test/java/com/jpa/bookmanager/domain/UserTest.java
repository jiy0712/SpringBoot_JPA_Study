package com.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setEmail("s2325@e-mirim.hs.kr");
        user.setName("s2325");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("s2325", "s2325@e-mirim.hs.kr", LocalDateTime.now(), LocalDateTime.now());
//        User user2 = new User("s2325", "s2325@e-mirim.hs.kr");
        System.out.println(">>> " + user); //이렇게 하면 해시코드로 나온다
        //tostring메소드를 오버라이딩 하는 것이 좋다 (오버라이딩 하면 s2325 나온다)

        User user3 = User.builder().name("s2325").email("s2325@e-mirim.hs.kr").build();
    }
}
//tostring메소드를 오버라이딩 하는 것이 좋다