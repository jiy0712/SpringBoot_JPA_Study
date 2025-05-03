package com.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString //tostring 오버라이드 (자동으로)

//Lombok
@NoArgsConstructor //아무런 인자를 주지 않고 new user()처럼 인자 없이 생성하는
@AllArgsConstructor //객체가 가지고 있는 모든 필드를 인자로 받아서 생성하는
@RequiredArgsConstructor //꼭 필요한 인자만을 이용해서 생성자를 만드는
@EqualsAndHashCode
//@Data //이거 쓰면 @Getter, @Setter, @RequiredArgsConstructor 제거해도 됨
@Builder //객체를 생성하고 필드값을 주입해주는데, 빌더의 형식을 가지고 제공해줌

//혹시나 @들이 안먹는다면, 플러그인에 lombok 설정되어 있는지 확인하기
public class User {
    private String name;
    private String email;
    private LocalDateTime createdAt; //생성된 시간
    private LocalDateTime updatedAt; //수정된 시간은 JPA 도메인에 무조건 필요함

    //    //tostring 오버라이드 (직접 추가방법, 비추천)
//    @Override
//    public String toString() {
//        return getClass().getName()
//                + " : "
//                + "name " + name
//                + ", email " + email
//                + ", createdAt = " + createdAt
//                + ", updatedAt = " + updatedAt;
//    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //JPA를 사용하기 위해서 필드변수(private)과 getter, setter를 만들어야한다.

    //getter / setter 만드는법
    //1. 다 하나하나 적는다(public String getName() ~~)
    //2. 우클릭 generate -> getter and setter를 이용해 모두 생성
    //3. 클래스 상단에 @Getter @Setter 설정
}
