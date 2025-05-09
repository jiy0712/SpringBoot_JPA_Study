package com.jpa.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
import jakarta.persistence.Id;

@Table(name = "users") //예약어 충돌 방지
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity //pk가 반드시 필요하다는 뜻

public class Users{ //User객체의 pk값 : id

    //Entity
    @Id
    @GeneratedValue
    private Long id; //id는 자동으로 증가하는 숫자값

    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}