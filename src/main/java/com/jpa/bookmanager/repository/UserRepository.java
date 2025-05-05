package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<User> extends JpaRepository<User, Long>{
}
