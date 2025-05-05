package com.jpa.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;

import java.time.LocalDateTime;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity //pk가 반드시 필요하다는 뜻

public class User{ //User객체의 pk값 : id

    //Entity
    @id
    @GeneratedValue
    private Long id; //id는 자동으로 증가하는 숫자값

    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}